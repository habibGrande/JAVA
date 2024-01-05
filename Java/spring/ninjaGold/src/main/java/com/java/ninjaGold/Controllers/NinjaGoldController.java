package com.java.ninjaGold.Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			}
		
		
		
		return "index.jsp";
	}
	
	@RequestMapping("/text")
	public String text() {
		return "text.jsp";
	}
	
	@RequestMapping("/NinjaGold")
	public String ninjaGold(HttpSession session,
			@RequestParam ("farm") String location,
			Model model
			) {
		ArrayList<String> activities = new ArrayList<String>();
		Integer gold = (Integer) (session.getAttribute("gold"));
		if(gold == null) {
			gold = 1;
		}
		Random random = new Random();
		Integer farmNum =  1;
        String text = "";
		if(location.equals("farm") ) {
			farmNum = random.nextInt(10,21);
			SimpleDateFormat date =  new SimpleDateFormat("MMMM d Y h:mm a");
			Date currentDate = new Date();
			String myDate = date.format(currentDate);
			text = ("you entered a farm and earned "+ farmNum +  "("+ myDate + ")" ) ;
		}
		if(location.equals("cave")) {
			farmNum = random.nextInt(5,10);
			SimpleDateFormat date =  new SimpleDateFormat("MMMM d Y h:mm a");
			Date currentDate = new Date();
			String myDate = date.format(currentDate);
			text = ("you entered a cave and earned "+ farmNum +"  gold." + "("+ myDate + ")" );
		}
		if(location.equals("house")) {
			farmNum = random.nextInt(2,5);
			SimpleDateFormat date =  new SimpleDateFormat("MMMM d Y h:mm a");
			Date currentDate = new Date();
			String myDate = date.format(currentDate);
			text =("you entered a house and earned "+ farmNum +"  gold." + "("+ myDate + ")" ) ;
		}
		if(location.equals("quest") ) {
			farmNum = random.nextInt(-50,50);
			SimpleDateFormat date =  new SimpleDateFormat("MMMM d Y h:mm a");
			Date currentDate = new Date();
			String myDate = date.format(currentDate);
			if(farmNum > 0) {
				text =("You completed a quest and earned "+ farmNum +"  gold. " + "("+ myDate + ")" );
			}
			else {
				text = ("You failed a quest and Lost "+ farmNum +"  gold. Outch. " + "("+ myDate + ")" );
			}
		}
		
		activities.add(0,text);
		session.setAttribute("gold", gold + farmNum);
		model.addAttribute("gold",gold);
		
		session.setAttribute("text", activities);
		model.addAttribute("text",activities );
		
		return "redirect:/";
	}
	
	
	
	
	
	
	
}
