package com.teamck.showing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@RequestMapping(value="/test")
	@ResponseBody
	public String test(@Value("${spring.datasource.url}") String url) {
		
		return url;
	}
}
