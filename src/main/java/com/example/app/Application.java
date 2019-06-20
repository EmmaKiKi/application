package com.example.app;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	@Bean
	public MyViewResoler myViewResoler() {
		return new MyViewResoler();
	}
	
//自定义师徒解析器，可以和默认的视图解析器共同作用
class MyViewResoler implements  ViewResolver  {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
}
