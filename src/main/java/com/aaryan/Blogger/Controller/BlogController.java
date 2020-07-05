package com.aaryan.Blogger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaryan.Blogger.Domain.Blogs;
import com.aaryan.Blogger.Domain.UserInfo;
import com.aaryan.Blogger.Service.BlogServiceImpl;

@Controller
@RequestMapping("/blog")
public class BlogController {

	private Blogs blogs;
	
	private UserInfo userinfo;
	
	@Autowired
	BlogServiceImpl service;
	
	@RequestMapping("/loginpage")
	public String loginpage(Model model) {
		UserInfo userinfo =new UserInfo();
		model.addAttribute("user",userinfo);
		
		return "loginPage";
	}
	
	
}
