package com.aaryan.Blogger.Repository;

import java.util.List;

import com.aaryan.Blogger.Domain.UserInfo;

public interface BlogRepo {

	List<UserInfo> getUserList();

	UserInfo getUserBlogs(int id);

}
