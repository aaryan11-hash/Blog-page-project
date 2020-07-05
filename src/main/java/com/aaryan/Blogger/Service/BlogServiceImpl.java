package com.aaryan.Blogger.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.aaryan.Blogger.Repository.BlogRepoImpl;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepoImpl blogdao;
	
	
	
}
