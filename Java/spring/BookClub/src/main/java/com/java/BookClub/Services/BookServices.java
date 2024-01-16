package com.java.BookClub.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.BookClub.Models.Books;
import com.java.BookClub.Repositories.BookRepository;
@Service
public class BookServices {
	@Autowired
	private BookRepository bookRepository;

	public BookServices(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Books> allBooks() {
		return bookRepository.findAll();
	}

	// creates a User
	public Books createBook(Books book) {
		return bookRepository.save(book);
	}

	// retrieves a User
	public Books findBook(Long id) {
		Optional<Books> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	// updates a Book
	public Books updateBook(Long bookId, Books updatedBook) {
	    Optional<Books> optionalBook = bookRepository.findById(bookId);
	    if (optionalBook.isPresent()) {
	        Books book = optionalBook.get();
	        // Update the book properties with the values from updatedBook
	        book.setTitle(updatedBook.getTitle());
	        book.setAuthor(updatedBook.getAuthor());
	        book.setThoughts(updatedBook.getThoughts());
	        return bookRepository.save(book);
	    } else {
	        return null; 
	    }
	}
	// delete a User
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);

	}
}
