package com.daikichi;
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
}
