package com.java.BooksAPI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.BooksAPI.models.Book;

@Controller
public class BookController {

	
	
	 @RequestMapping("/books/{id}")
	    public String index() {
	        return "show.jsp";
	    }
}
