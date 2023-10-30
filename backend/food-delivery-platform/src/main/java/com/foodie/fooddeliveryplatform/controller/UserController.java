package com.foodie.fooddeliveryplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodie.fooddeliveryplatform.entity.User;
import com.foodie.fooddeliveryplatform.model.UserModel;
import com.foodie.fooddeliveryplatform.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<Void> saveUser(@RequestBody User user){
		
		userService.saveUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Passanger create", "done");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserModel> getUser(@PathVariable int id)
	{
	  UserModel userModel = userService.getUserById(id);
	  
	  return new ResponseEntity<UserModel>(userModel,HttpStatus.OK);
		
	}
	
	@PostMapping("/passwordUpdated/{userName}/{password}")
	
	public ResponseEntity<Integer> passwordUpdated(@PathVariable String userName, @PathVariable String password)
	{
		int updateSuccesFull = 0;
		updateSuccesFull = userService.passwordUpadte(password, userName);
		
		if(updateSuccesFull==1)
		{
			updateSuccesFull=1;
		}
		
		else
		{
			System.out.println("Password not updated due to some of the technical reason");
		}
		
		return new ResponseEntity<Integer>(updateSuccesFull,HttpStatus.OK);
		
		
	}

}
