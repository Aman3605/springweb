package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/myHome", method = RequestMethod.GET)
	public String showHome(ExtendedModelMap model) {
		
		model.addAttribute("user", "Mike");
        model.addAttribute("d", new java.util.Date());
        
		return "home";  //returns view home.jsp with model
	}
	
	@RequestMapping("/spring")
    public String showSecond()
    {
        return "second"; //returns view
    }
}
