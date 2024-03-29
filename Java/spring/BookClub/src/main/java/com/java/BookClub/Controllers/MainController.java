package com.java.BookClub.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.BookClub.Models.Books;
import com.java.BookClub.Models.LoginUser;
import com.java.BookClub.Models.User;
import com.java.BookClub.Services.BookServices;
import com.java.BookClub.Services.UserServices;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	private UserServices userService; 
	@Autowired
	private BookServices booksService; 
	
	
	
	@RequestMapping("/")
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
       	 return "redirect:/books";
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
        return "redirect:/books";
    }
	 @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        session.invalidate();
	        return "redirect:/";
	    }
	
	 @GetMapping("/books")
		public String books(HttpSession session, Model model) {
		
			if (session.getAttribute("userId") == null) {
				return "redirect:/";
			} else {
				// Get the user ID from the session
				Long userId = (Long) session.getAttribute("userId");
				// Use the user ID to retrieve the user from your userService
				User currentUser = userService.findUser(userId);
				List<Books> allBook = booksService.allBooks();
				model.addAttribute("currentUser",currentUser);
				model.addAttribute("allBooks", allBook);
				return "books.jsp";
			}
		}
	 
	 
	 
	 @GetMapping("/addBook")
		public String addBook(HttpSession session, Model model) {
			// Check if the user is logged in (e.g., by checking if a specific attribute
			// exists in the session)
			if (session.getAttribute("userId") == null) {
				// User is not logged in, so redirect them to the login and registration page
				return "redirect:/";
			} else {
				model.addAttribute("book", new Books());
				return "addBook.jsp";
			}

		}

		@PostMapping("/addBook")
		public String addBook(@Valid @ModelAttribute("book") Books book, BindingResult result, HttpSession session,
				Model model) {
			if (result.hasErrors()) {
				return "addBook.jsp";
			} else {
				// Get the user ID from the session
				Long userId = (Long) session.getAttribute("userId");
				// Use the user ID to retrieve the user from your userService
				User currentUser = userService.findUser(userId);
				book.setUser(currentUser);
				booksService.createBook(book);
				session.setAttribute("successMessage", "Book added successfully");
				return "redirect:/books"; // Redirect to the home page
			}
		}

	 
		@GetMapping("/showBook/{bookId}")
		public String showBook(@PathVariable("bookId") Long bookId, HttpSession session, Model model) {
			// Check if the user is logged in (e.g., by checking if a specific attribute
			// exists in the session)
			if (session.getAttribute("userId") == null) {
				// User is not logged in, so redirect them to the login and registration page
				return "redirect:/";
			} else {
				// Fetch the user
				Long userId = (Long) session.getAttribute("userId"); // Assuming userId is stored in the session
				// Fetch the book
				Books book = booksService.findBook(bookId);
				if (book != null && book.getUser() != null && book.getUser().getId().equals(userId)) {
					// The book was posted by the logged-in user
					model.addAttribute("book", book);
					return "show.jsp";
				} else {
					model.addAttribute("book", book);
					return "books.jsp";
				}

			}
		}

		@GetMapping("/editBook/{editId}")
		public String editBook(@PathVariable("editId") Long editId,HttpSession session, Model model) {
			// Check if the user is logged in (e.g., by checking if a specific attribute
			// exists in the session)
			if (session.getAttribute("userId") == null) {
				// User is not logged in, so redirect them to the login and registration page
				return "redirect:/";
			} else {
				Books book = booksService.findBook(editId);
				model.addAttribute("book", book);
				return "edit.jsp";
			}

		}
	 
	 
	 
		@GetMapping("/deleteBook/{deleteId}")
		public String deleteBook(@PathVariable("deleteId") Long deleteId, HttpSession session) {
		    // Check if the user is logged in (e.g., by checking if a specific attribute
		    // exists in the session)
		    if (session.getAttribute("userId") == null) {
		        // User is not logged in, so redirect them to the login and registration page
		        return "redirect:/";
		    } else {
		        // Perform the deletion of the book with ;the specified deleteId
		        booksService.deleteBook(deleteId);
		        return "redirect:/books"; // Redirect to the home page after deleting the book
		    }
		}
	 
	 
	 
	 
	
}
