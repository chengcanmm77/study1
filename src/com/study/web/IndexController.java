package com.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/hello.do")
	public String  hello() {
		return "hello";
	}
	
	@RequestMapping("/hello2.do")
	public String hello2() {
		return "index";
	}
}
