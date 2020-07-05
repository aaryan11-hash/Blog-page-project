package com.aaryan.Blogger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping("/")
	public String redirectingPage() {
		return "FIRST";
	}
	
}
