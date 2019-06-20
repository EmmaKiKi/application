package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.model.User;

@Controller
public class LoginController {
	
	

	@RequestMapping("/login")
	public String login(@Validated User user) {
		
		return null;
	}
}
