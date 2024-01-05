package com.java.OmikujiForm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class controller {
	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/process")
	public String process(
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person ,
			@RequestParam(value="endeavor") String endeavor ,
			@RequestParam(value="living_thing") String living_thing ,
			@RequestParam(value="nice_thing") String nice_thing,
			HttpSession session
			){
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("endeavor", endeavor);
		session.setAttribute("living_thing", living_thing);
		session.setAttribute("nice_thing", nice_thing);
		
		
		
		return "redirect:/Omikuji/show";
	}

	@RequestMapping("/Omikuji/show")
	public String show() {
		return "show.jsp";
	}

}
