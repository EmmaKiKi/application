package com.example.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//EnableWebMvc注解使所有的SpringMVC的自动配置都失效了,使用我们自己配置的内容、
//其实不使用@EnableWebMvc注解也是可以实现配置Webmvc，只需要将配置类继承于WebMvcConfigurationSupport类即可
//既保留了所有的自动配置，也能用我们扩展的配置；编写一个配置类（@Configuration），是WebMvcConfigurerAdapter类型；不能标注@EnableWebMvc;
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//相当于在Controller中添加一个/simple的处理器，并且返回"success"
		registry.addViewController("/simple").setViewName("success");
	}

	
}
