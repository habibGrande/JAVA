package com.java.DojoAndNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.DojoAndNinjas.Repositories.DojoRepository;
import com.java.DojoAndNinjas.models.Dojo;



@Service
public class DojoService {
	 private final DojoRepository DojoRepository;
	    
	    public DojoService(DojoRepository DojoRepository) {
	        this.DojoRepository = DojoRepository;
	    }
	    // returns all the Dojos
	    public List<Dojo> allDojos() {
	        return DojoRepository.findAll();
	    }
	    // creates a Dojo
	    public Dojo createDojo(Dojo b) {
	        return DojoRepository.save(b);
	    }
	    // retrieves a Dojo
	    public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = DojoRepository.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }
	    public Dojo updateDojo(Dojo Dojo) {
	        return DojoRepository.save(Dojo);
	      }

	    public void deleteDojo(Long id) {
	    	DojoRepository.deleteById(id);
	    }
}
