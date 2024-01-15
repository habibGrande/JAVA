package com.java.LoginAndRegistration.Services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.java.LoginAndRegistration.Models.LoginUser;
import com.java.LoginAndRegistration.Models.User;
import com.java.LoginAndRegistration.Repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public User register(User newUser, BindingResult result) {

    	if(userRepository.findByEmail(newUser.getEmail()).isPresent()) {
    		result.rejectValue("email", "error", "Email is already exist");
    	}
		if(newUser.getPassword() != newUser.getConfirm() || newUser.getPassword() == null) {
			result.rejectValue("password", "error", "Password not Match");
		}
		else {
				String hashedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
				newUser.setPassword(hashedPW);
		}
			return userRepository.save(newUser);
			}

    public User login(LoginUser newLoginObject, BindingResult result) {
       
        return null;
    }
}