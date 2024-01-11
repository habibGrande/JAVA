package com.java.BooksAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.BooksAPI.models.Book;
import com.java.BooksAPI.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	
	
	 
	 @GetMapping("/books/{id}")
	 public String render(@PathVariable("id") Long id,Model model) {
		 Book book = bookService.findBook(id);
		 model.addAttribute("book",book);
		 System.out.println(book);
		 return "show.jsp";
	 }
	 
}
