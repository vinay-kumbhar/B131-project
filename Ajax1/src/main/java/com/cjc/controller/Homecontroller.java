package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller 
{
	@RequestMapping("/")
	public String m1()
	{
		return "index";
	}
	@ResponseBody
	@RequestMapping("/log")
	public String m2()
	{
		return "Hello cjc";
	}

}
