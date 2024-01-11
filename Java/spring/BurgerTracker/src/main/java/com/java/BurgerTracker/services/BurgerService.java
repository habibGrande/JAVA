package com.java.BurgerTracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.BurgerTracker.models.Burger;
import com.java.BurgerTracker.repositories.BurgerRepository;



@Service
public class BurgerService {
	
	private final BurgerRepository burgerRepository;
	
	 public BurgerService(BurgerRepository burgerRepository) {
	        this.burgerRepository = burgerRepository;
	    }
	
	 public List<Burger> allBurgers() {
	        return burgerRepository.findAll();
	    }
	
	 public Burger createBurger(Burger b) {
	        return burgerRepository.save(b);
	    }
	
	 public Burger findBurger(Long id) {
	        Optional<Burger> optionalDojo = burgerRepository.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }
	    public Burger updateBurger(Burger burger) {
	        return burgerRepository.save(burger);
	      }
	
	
	
	
	
	
}
