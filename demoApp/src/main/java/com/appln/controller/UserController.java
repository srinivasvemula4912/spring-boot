package com.appln.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appln.dao.UserRepository;	
import com.appln.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
    @GetMapping("/signup")
    public String showSignUpForm(User user) {
    	System.out.println("signup ------ page");
        return "add-user";
    }
    
	@PostMapping("/add")
	public String createUser(@Valid User user, BindingResult result, Model model ){
		
		if (result.hasErrors()){
			return "add-user";
		}
		System.out.println(""+user);
		repository.save(user);
		return "success";
	}
}
