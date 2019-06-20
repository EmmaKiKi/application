package com.example.app.config;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
//LocaleResolver  作用在于根据不同的用户区域展示不同的视图，而用户的区域也称为Locale，该信息是可以由前端直接获取的.通过这种方式，可以实现一种国际化的目的
@Configuration
public class MyLocaleResolver implements LocaleResolver{

	/**
	 * 重写解析地区的方法，如果请求参数中有l,则使用参数值new出的Locale对象来作为用户的使用地区解析画面
	 */
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 国际化Locale（区域信息对象）；LocaleResolver（获取区域信息对象）；
	 * @return
	 */
	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocaleResolver();
	}
	
}
