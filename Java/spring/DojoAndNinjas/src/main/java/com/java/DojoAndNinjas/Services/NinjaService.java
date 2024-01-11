package com.java.DojoAndNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.DojoAndNinjas.Repositories.NinjaRepository;
import com.java.DojoAndNinjas.models.Ninja;

@Service
public class NinjaService {
	 private final NinjaRepository ninjaRepository;
	    
	    public NinjaService(NinjaRepository ninjaRepository) {
	        this.ninjaRepository = ninjaRepository;
	    }
	   
	    public List<Ninja> allNinjas() {
	        return ninjaRepository.findAll();
	    }
	   
	    public Ninja createNinja(Ninja b) {
	        return ninjaRepository.save(b);
	    }
	    // retrieves a Ninja
	    public Ninja findNinja(Long id) {
	        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }
	    public Ninja updateNinja(Ninja Ninja) {
	        return ninjaRepository.save(Ninja);
	      }

	    public void deleteNinja(Long id) {
	    	ninjaRepository.deleteById(id);
	    }
}
