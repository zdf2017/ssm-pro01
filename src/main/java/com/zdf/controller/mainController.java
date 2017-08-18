package com.zdf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"main",""})
public class mainController {

	@RequestMapping(value={"/","index"},method=RequestMethod.GET)
	public String test1(HttpServletRequest request){
		String requesturl = request.getRequestURL().toString();
		System.out.println("url>>"+requesturl);
		System.out.println("index");
		return "index";
	}
	
	
	/**
	 * 进入登陆页面
	 * **/
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(){
		System.out.println("登陆");
		return "login";
	}
	
	/**
	 * 通用404页面
	 * **/
	@RequestMapping(value={"404"})
	public String error404(){
		return "ccommon/404";
	}
	
	
	
}
