package com.aaryan.Blogger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.aaryan.Blogger.Domain.UserInfo;
import com.aaryan.Blogger.Repository.BlogRepo;

@Component
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepo blogdao;
	
	@Override
	@Transactional
	public List<UserInfo> getUserList(){
		
		return blogdao.getUserList();
	}
	
	@Override
	@Transactional
	public UserInfo getUserBlogs(int id){
		
		return blogdao.getUserBlogs(id);
	}

	@Override
	@Transactional
	public void saveUser(UserInfo user) {

		blogdao.saveUser(user);
	}



	
}
