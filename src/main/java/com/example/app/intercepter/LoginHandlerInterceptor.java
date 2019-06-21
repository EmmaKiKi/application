package com.example.app.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
/**
 * 登录拦截器，实现处理器拦截器接口
 * @author yuqi.yang
 *
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

	/**
	 * 目标方法执行之前
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/**
		 * 1.从session中获取user登录信息
		 * 2.如果存在user对象，则放行，返回true
		 *   如果不存在，则在request中添加 信息属性，提示错误信息，并转发请求到login页面,返回false
		 */
		Object attribute = request.getSession().getAttribute("user");
		if(attribute==null) {
			//如果不存在，则在request中添加 信息属性
			request.setAttribute("errorMsg", "无权限请先登录");
			request.getRequestDispatcher("/index").forward(request, response);
			return false;
		}else {
			//如果存在user对象，则放行，返回true
			return true;
		}
	}

	/**
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	/**
	 * 在目标方法执行后
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
