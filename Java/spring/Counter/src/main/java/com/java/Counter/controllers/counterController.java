package com.java.Counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class counterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		
		if(session.getAttribute("count") == null) {
			session.setAttribute("count",0);
		}
		else {
			int counter = (int)session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
		}
		return "counter.jsp";
	}

	
	
	
	
	
	
}
