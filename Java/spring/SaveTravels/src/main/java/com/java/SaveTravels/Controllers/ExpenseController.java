package com.java.SaveTravels.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.SaveTravels.Models.Expense;
import com.java.SaveTravels.Services.ExpenseServices;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	private final ExpenseServices expenseService;
	public ExpenseController(ExpenseServices expenseService) {
		this.expenseService = expenseService;
	}
	
	
	@RequestMapping("/")
	public String index(@ModelAttribute("expense") Expense expense,Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	@PostMapping("/create")
    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	expenseService.createExpense(expense);
            return "redirect:/";
        }
    }
	
	
	@RequestMapping("/edit/{id}")
	public String editpage(@PathVariable("id") Long id,  @ModelAttribute("expense") Expense expense ,Model model) {
		model.addAttribute("expense",expenseService.findExpense(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
    public String edit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result,Model model,
    		@PathVariable("id") Long id) {
        if (result.hasErrors()) {
        	model.addAttribute("expense", expense);
            return "edit.jsp";
        } else {
        	expenseService.update(expense);
            return "redirect:/";
        }

	}
	
	@RequestMapping("/delete/{id}")
    public String delete(
    		@PathVariable("id") Long id) {
     
        	expenseService.deleteExpense(id);
            return "redirect:/";
 

	}
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id,Model model) {
		Expense expense = expenseService.findExpense(id);
    	model.addAttribute("expense",expense);
		return "show.jsp";
	}
	
	
	}
