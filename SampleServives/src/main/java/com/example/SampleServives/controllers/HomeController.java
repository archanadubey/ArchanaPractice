package com.example.SampleServives.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.SampleServives.models.Users;
import com.example.SampleServives.service.UserService;

@RestController
@RequestMapping("/users")
public class HomeController {
	
	private final UserService userService;
	
	
	 public HomeController(UserService userService) {
	        this.userService = userService;
	        System.out.println("hellow");
	    }
	 
	 @GetMapping("/use")
	 public String getString() {
		 System.out.println("hellow use");
		 return "hellow world";
		 
	 }

	  @GetMapping("/data")
	    public List<Users> getAllUsers() {
		 List <Users> data = (List<Users>) this.userService.getAllUsers();
		 System.out.println(data.toString());
		 System.out.println(userService.getAllUsers());
		 
	        return userService.getAllUsers();
	        
	       

	    }

	  
//	  @PostMapping
//	    public void createUser(@RequestBody Users users) {
//	        userService.saveUsers(users);
//    
//	        @GetMapping("/users/{id}")
//	    public Users getUserById(@PathVariable Long id) {
//	        return userService.getUserById(id);
//	    }
	
	

}
