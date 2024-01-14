package com.java.SaveTravels.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.java.SaveTravels.Models.Expense;
import com.java.SaveTravels.Repositories.ExpenseRepository;

@Service
public class ExpenseServices {
	private final ExpenseRepository espenseRepository;
    
	public ExpenseServices(ExpenseRepository espenseRepository) {
    	this.espenseRepository = espenseRepository;
	}
		// returns all the books
	public List<Expense> allExpenses() {
    	return espenseRepository.findAll();
	}
		// creates a -
	public Expense createExpense(Expense b) {
    	return espenseRepository.save(b);
	}
		// retrieves a -
	 public Expense findExpense(Long id) {
    	Optional<Expense> optionalExpense = espenseRepository.findById(id);
    		if(optionalExpense.isPresent()) {
        		return optionalExpense.get();
    	} else {
        	return null;
    	}
	 
	 }
	 
	 public void deleteExpense(Long id) {
		 espenseRepository.deleteById(id);
	 }
	 
	 public Expense update(Expense travel) {
		    Optional<Expense> optionalTravel = espenseRepository.findById(travel.getId());
		    
		    
	        if(optionalTravel.isPresent()) {
	        	
		        travel.setTitle(travel.getTitle());
		        travel.setVentor(travel.getVentor());
		        travel.setAmount(travel.getAmount());
		        travel.setDescription(travel.getDescription());
		        return  espenseRepository.save(travel);
	        
	        } else {
	        	
	            return null;
	        }
	    }
	  
	  
	  
	  
}
