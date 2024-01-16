package com.java.LoginAndRegistration.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.LoginAndRegistration.Models.LoginUser;
import com.java.LoginAndRegistration.Models.User;
import com.java.LoginAndRegistration.Services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class userController {
    
	@Autowired
	private UserService userService; 
    
    @GetMapping("/")
    public String index(Model model) {
    
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(
    		@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result,
            Model model,
            HttpSession session) {
        
   	 		User user = userService.register(newUser, result);
   	 
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        	
        else { 
       	 session.setAttribute("userId", user.getId());
       	 session.setAttribute("userName", user.getUserName());
       	 return "redirect:/home";
        }
    }
    @GetMapping("/home")
    public String successPage(HttpSession session, Model model) {
   	    if (session.getAttribute("userId") == null) {
   	        return "redirect:/";
   	    }
   	    else {
   	    	 return "welcome.jsp";
   	    }
   	
    }
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
         User user = userService.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
    
        session.setAttribute("userId", user.getId());
      	 session.setAttribute("userName", user.getUserName());
        return "redirect:/home";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // Clear the user's session
        session.invalidate();
        
        // Redirect the user to the login and registration page
        return "redirect:/";
    }
    
    
}
