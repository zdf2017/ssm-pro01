package com.zdf.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("error")
public class ErrorController {

	@RequestMapping("404")
	public ModelAndView Error404(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error/404");
		return mv;
	}
}
