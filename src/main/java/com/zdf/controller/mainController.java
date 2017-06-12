package com.zdf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"test",""})
public class mainController {

	@RequestMapping(value={"/","index"},method=RequestMethod.GET)
	public String test1(HttpServletRequest request){
		String requesturl = request.getRequestURL().toString();
		System.out.println("url>>"+requesturl);
		System.out.println("index");
		return "index";
	}
	
	
	
}
