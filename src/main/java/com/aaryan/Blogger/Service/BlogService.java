package com.aaryan.Blogger.Service;

import java.util.List;

import com.aaryan.Blogger.Domain.UserInfo;

public interface BlogService {

	List<UserInfo> getUserList();

	UserInfo getUserBlogs(int id);

	void saveUser(UserInfo user);
	
}
