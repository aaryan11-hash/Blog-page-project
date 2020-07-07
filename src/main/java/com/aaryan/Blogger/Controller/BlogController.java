package com.aaryan.Blogger.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaryan.Blogger.Domain.Blogs;
import com.aaryan.Blogger.Domain.UserBuild;
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
	
	public BlogController() {
		this.userinfo=new UserInfo();
	}
	
	
	@RequestMapping("/loginpage")
	public String loginpage(Model model) {
		UserInfo userinfo =new UserInfo();
		model.addAttribute("user",userinfo);
		
		return "loginPage";
	}
	
	@GetMapping("/afterlogin")
	public String verifyLogin(@ModelAttribute("user") UserInfo user,Model model) {
		int truth=helper.verifiedloginUser(service.getUserList(),user);
		System.out.println("truth value:"+truth);
		if(truth==0) {
			
			return "redirect:/blog/loginpage";
		}else {
			this.userinfo=service.getUserBlogs(truth);
			this.userBlogs=this.userinfo.getBlogsList();
			
			//cookie=new Cookie("username",this.userinfo.getUsername());
			//cookie.setMaxAge(60*60);
			//response.addCookie(cookie);
			
			model.addAttribute("username",userinfo.getUsername());
			
			
			return "home-page";
		}
		
	
		
		
}
	
	@GetMapping("/signup")
	public String signUpUser(Model model) {
		
	
		model.addAttribute("newuser",new UserBuild());
	
		return "sign-up";
	}
	
	@GetMapping("/profileBuilder")
	public String profileBuilder(@Valid @ModelAttribute("newuser") UserBuild newuser,BindingResult result,Model model) {
		System.out.println("username==>"+newuser.getUsername());
		
		if(result.hasErrors()) {
			System.out.println("inside result error if block");
			return "redirect:/blog/signup";
			}
		else {
			
			System.out.println("inside else condition");
			
			
			
			int truth=this.helper.verifiedloginUser(service.getUserList(),new UserInfo(newuser.getUsername(),newuser.getPassword()));
			
			if(truth==0) {
				this.userinfo.setUsername(newuser.getUsername());
				this.userinfo.setPassword(newuser.getPassword());
				model.addAttribute("user",new UserInfo());
				model.addAttribute("username",this.userinfo.getUsername());
				return "profilebuilder";
			}
			else
				return "redirect:/blog/signup";
			
		}
	}

	@GetMapping("/postProcessing")
	public String savingNewUser(@Valid @ModelAttribute UserInfo userInfo,BindingResult result,Model model){
		if(result.hasErrors()){
			return "redirect:/blog/profileBuilder";
		}
		else{
			userInfo.setUsername(this.userinfo.getUsername());
			userInfo.setPassword(this.userinfo.getPassword());
			this.userinfo=userInfo;
			service.saveUser(userinfo);
			model.addAttribute("user",this.userinfo);


			return "home-page";
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

