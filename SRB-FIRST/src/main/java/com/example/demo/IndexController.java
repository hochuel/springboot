package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index" , method=RequestMethod.GET) 
	public String getIndex() { 
		
		//테스트 파일입니다.
		
		return "index";
	}
}
