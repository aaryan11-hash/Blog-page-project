package com.aaryan.Blogger.Repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.aaryan.Blogger.Domain.UserInfo;

public class BlogRepoImpl implements BlogRepo {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<UserInfo> getUserList(){
		Session session=sessionFactory.getCurrentSession();
		
		Query<UserInfo> list=session.createQuery("from UserInfo");
		List<UserInfo> finallist=list.getResultList();
		
		return finallist;
	}
	
	@Override
	public UserInfo getUserBlogs(int id) {
		Session session=sessionFactory.getCurrentSession();
		
		UserInfo blogger=session.get(UserInfo.class,id);
		blogger.getBlogsList();
		
		return blogger;
	}
	
	
}
