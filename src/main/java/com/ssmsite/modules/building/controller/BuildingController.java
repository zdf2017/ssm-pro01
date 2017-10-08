package com.ssmsite.modules.building.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssmsite.modules.building.entity.InfoSubjectBuilding;

@Controller
@RequestMapping(value={"building"})
public class BuildingController {

	
	@RequestMapping(value={"info"},method=RequestMethod.GET)
	public ModelAndView getInfo(InfoSubjectBuilding infoBuilding){
		return null;
	}
	
}
