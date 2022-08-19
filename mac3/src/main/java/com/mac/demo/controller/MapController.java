package com.mac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/map")
@Controller
public class MapController {

	@GetMapping("/map")
	public String map(){
	
		return "thymeleaf/mac/map/map";
	}
	
}
