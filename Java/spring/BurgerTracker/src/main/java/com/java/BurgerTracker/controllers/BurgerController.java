package com.java.BurgerTracker.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.BurgerTracker.models.Burger;
import com.java.BurgerTracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	private final BurgerService burgerService;
	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	    
	@RequestMapping("/")
	public String index(@ModelAttribute("burger") Burger burger,Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	@PostMapping("/Burger")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	burgerService.createBurger(burger);
            return "redirect:/";
        }
    }
	
	@RequestMapping("/edit/{id}")
	public String editpage(@PathVariable("id") Long id, @ModelAttribute("burger") Burger burger ,Model model) {
		model.addAttribute("burger",burgerService.findBurger(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
    public String edit(@Valid @ModelAttribute("burger") Burger burger, BindingResult result,Model model,
    		@PathVariable("id") Long id) {
        if (result.hasErrors()) {
        	model.addAttribute("burger", burger);
            return "edit.jsp";
        } else {
        	burgerService.updateBurger(burger);
            return "redirect:/";
        }
    }
	
	
	
	
	
}
