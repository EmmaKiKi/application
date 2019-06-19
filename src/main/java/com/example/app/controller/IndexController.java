package com.example.app.controller;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.DateUtils;

@Controller
public class IndexController {

	
	@RequestMapping("index")
	public String sayHello(Model model) {
		model.addAttribute("time",DateUtils.format(new Date(), "YYY-MM-dd HH:mm:ss", Locale.CHINA));
		return "login";
	}
}
