package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;

@Service
public class UserService {

	private List<User> store=new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"kedar jagtap", "kedarjagtap@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Vishu Pudale", "vishu@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Vinayak Sutar", "vinayak@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shubham Jadhav", "shubham@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
	

}
