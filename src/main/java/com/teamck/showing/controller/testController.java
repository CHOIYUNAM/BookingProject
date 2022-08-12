package com.teamck.showing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@RequestMapping(value="/test")
	@ResponseBody
	public String test() {
		return "Hello World!";
	}
}
