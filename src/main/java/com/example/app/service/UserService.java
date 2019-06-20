package com.example.app.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.example.app.model.User;

@Service
public class UserService {

	public String login(User user) {
		String email=user.getEmail();
		String password=user.getPassword();
		if(StringUtils.equals(email, "12345678@qq.com")&&StringUtils.equals(password, "12345678@qq.com")) {
		}
		return null;
	}
}
