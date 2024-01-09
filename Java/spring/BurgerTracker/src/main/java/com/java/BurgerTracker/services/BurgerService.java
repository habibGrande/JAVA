package com.java.BurgerTracker.services;

import java.util.List;

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
	
	
	
	
	
	
	
	
}
