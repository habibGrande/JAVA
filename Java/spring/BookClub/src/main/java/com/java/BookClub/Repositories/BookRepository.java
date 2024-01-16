package com.java.BookClub.Repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.java.BookClub.Models.Books;

public interface BookRepository extends CrudRepository<Books, Long>{
	
	// this method retrieves all books from the database
    List<Books> findAll();
    

}