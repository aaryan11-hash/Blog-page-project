package com.aaryan.Blogger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaryan.Blogger.Domain.Blogs;
import com.aaryan.Blogger.Domain.UserInfo;

@Controller
@RequestMapping("/blog")
public class BlogController {

	private Blogs blogs;
	
	private UserInfo userinfo;
	
	
	@RequestMapping("/loginpage")
	public String loginpage(Model model) {
		UserInfo userinfo =new UserInfo();
		model.addAttribute("user",userinfo);
		
		return "loginPage";
	}
}
