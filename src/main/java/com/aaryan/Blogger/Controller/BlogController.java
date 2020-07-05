package com.aaryan.Blogger.Controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaryan.Blogger.Domain.Blogs;
import com.aaryan.Blogger.Domain.UserInfo;
import com.aaryan.Blogger.Helper.AuthenticationAndLogin;
import com.aaryan.Blogger.Service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {

	private List<Blogs> userBlogs;
	
	private Blogs blogRenderer;
	
	private UserInfo userinfo;
	
	private AuthenticationAndLogin helper;
	
	@Autowired
	BlogService service;
	
	@RequestMapping("/loginpage")
	public String loginpage(Model model) {
		UserInfo userinfo =new UserInfo();
		model.addAttribute("user",userinfo);
		
		return "loginPage";
	}
	
	@GetMapping("/afterlogin")
	public String verifyLogin(@ModelAttribute("user") UserInfo user ,Model model,Cookie cookie,HttpServletResponse response) {
		int truth=helper.verifiedloginUser(service.getUserList(),user);
		
		if(truth==0) {
			
			return "redirect:/blog/loginpage";
		}else {
			this.userinfo=service.getUserBlogs(truth);
			this.userBlogs=this.userinfo.getBlogsList();
			
			cookie=new Cookie("username",this.userinfo.getUsername());
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			
			return "home-page";
		}
		
	
		
		
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

