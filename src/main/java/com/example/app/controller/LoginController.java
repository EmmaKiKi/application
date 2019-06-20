package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.model.User;

@Controller
public class LoginController {
	
	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user) {
		return null;
	}
}
