package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.model.User;

@Controller
public class LoginController {
	
	/**
	 * 登录功能：
	 * 1.拦截器登录检查，用于权限验证
	 * @param user
	 * @return
	 */
	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user) {
		return null;
	}
}
