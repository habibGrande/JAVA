package com.java.DojoAndNinjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.java.DojoAndNinjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	
	
	 	List<Ninja> findAll();
	    // this method finds books with descriptions containing the search string
	    List<Ninja> findByFirstNameContaining(String search);
	    // this method counts how many titles contain a certain string
	    Long countByFirstNameContaining(String search);
	    // this method deletes a book that starts with a specific title
	    Long deleteByFirstNameStartingWith(String search);
	
}
