package com.example.demo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	UserService user;
	
	@GetMapping("/users")
	public  List<User> getUser() {
		System.out.println("get users");
		return user.getUsers();
	}
	
	@GetMapping("/currentUser")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}

}
