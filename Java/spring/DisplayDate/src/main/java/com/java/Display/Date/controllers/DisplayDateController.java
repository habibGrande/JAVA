package com.java.Display.Date.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {

	@RequestMapping("/")
	public String index() {
		
		return "Index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat date =  new SimpleDateFormat("EEE, MMM MM ,yyyy");
		Date currentDate = new Date();
		String myDate = date.format(currentDate);
		
		model.addAttribute("date", myDate);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat time = new SimpleDateFormat("hh:mm a");
		Date currentTime = new Date();
	    String myTime = time.format(currentTime);
	    
		model.addAttribute("time", myTime);
		
		
		return "time.jsp";
	}
	
	
}
