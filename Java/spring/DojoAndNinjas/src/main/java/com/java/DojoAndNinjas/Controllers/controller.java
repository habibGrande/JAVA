package com.java.DojoAndNinjas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.DojoAndNinjas.Services.DojoService;
import com.java.DojoAndNinjas.Services.NinjaService;
import com.java.DojoAndNinjas.models.Dojo;
import com.java.DojoAndNinjas.models.Ninja;

import jakarta.validation.Valid;

@Controller
public class controller {
	@Autowired
	DojoService dojoService;
	NinjaService ninjaService;

	
	@GetMapping("/dojos/new")
	public String Main(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
    @PostMapping("/dojos/new")
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {

        if (result.hasErrors()) {
            return "index.jsp";
        } else {

			dojoService.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }
    @GetMapping("/ninjas/new")
    public String showDojo(@ModelAttribute("ninja") Ninja ninja,Model model ){
    	List<Dojo> dojo = dojoService.allDojos();
		model.addAttribute("dojo", dojo);
    	return "showDojo.jsp";
    }
    
    @PostMapping("/ninjas/new")
    public String ninja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
    	
    	 if (result.hasErrors()) {
             return "redirect:/ninjas/new";
         } else {
    	ninjaService.createNinja(ninja); 
         }
        return "redirect:/ninjas/new";
    }
    
    @GetMapping("/dojos/{id}")
    public String dojosS(@ModelAttribute("dojos") Dojo dojo,Model model ,@PathVariable("id") Long id ){
    	Dojo dojos = dojoService.findDojo(id);
    	
		model.addAttribute("dojo", dojos);
    	return "show.jsp";
    }
    
    
    
    
    
    
    
}
    
    
    
    
    
    
	

