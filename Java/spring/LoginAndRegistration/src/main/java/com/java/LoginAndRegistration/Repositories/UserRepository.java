package com.java.LoginAndRegistration.Repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.LoginAndRegistration.Models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	 Optional<User> findByEmail(String email);
	
	
}

	
