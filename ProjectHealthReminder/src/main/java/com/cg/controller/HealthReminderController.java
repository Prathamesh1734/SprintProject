package com.cg.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.User;
import com.cg.service.UserService;

@RestController
@RequestMapping("/ctrl")
public class HealthReminderController {
	
	private UserService userService;
	
	@GetMapping("/getbyname/{username}")
	public ResponseEntity<List<User>> getUserByName(@PathVariable("username")String username){
		List<User> users=userService.findByName(username);
		if(users.isEmpty()) {
			return new ResponseEntity("User is not available",HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		}
	}

}
