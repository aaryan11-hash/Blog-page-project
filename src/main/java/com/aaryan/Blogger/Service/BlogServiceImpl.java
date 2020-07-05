package com.aaryan.Blogger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.aaryan.Blogger.Domain.UserInfo;
import com.aaryan.Blogger.Repository.BlogRepo;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepo blogdao;
	
	@Override
	@Transactional
	public List<UserInfo> getUserList(){
		
		return blogdao.getUserList();
	}
	
}