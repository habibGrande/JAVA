package com.java.helloHuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloHumanController {
	
	
	 @RequestMapping("/")
	    public String hellohuman(){
	    	return "Hello Human" ;
	    }
	 
	 @RequestMapping("/name/{first_name}")
	 public String name(@PathVariable("first_name") String first_name){
		    	return "hello: " + first_name ;
		    }
		 
	 @RequestMapping("/name/{first_name}/{last_name}")
	 public String showLesson(@PathVariable("first_name") String first_name, @PathVariable("last_name") String last_name){
		    	return "Hello " + first_name + " " + last_name;
		    }
		 
		 
	 
}
