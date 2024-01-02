package com.daikichi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	 @RequestMapping(value="", method=RequestMethod.GET)
	    public String wellcome() {
	        return "Wellcome";
	    }

	    @RequestMapping("/today")
	    public String today() {
	        return "today is your lucky day";
	    }

	    @RequestMapping("/tomorrow")
	    public String tomorrow() {
	        return "tomorrow will be better";
	    }
	    
	    @RequestMapping(value="/daikichi/travel/{city}",method=RequestMethod.GET )
	    public String city(@PathVariable("city") String city){
	    	return "Congratulations! You will soon travel to  " + city + "!" ;
	    }
	    
	    @RequestMapping(value="/daikichi/lotto/{num}",method=RequestMethod.GET )
	    public String lotto(@PathVariable("num") int number){
	    	if(number%2 == 0) {
	    		return " you will take a grand journey in the near future, but be weary of tempting offers.";
	    	}
	    	else {
	    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends." ;
	    	}
	    	
	    }
	    
	    
	    
}
