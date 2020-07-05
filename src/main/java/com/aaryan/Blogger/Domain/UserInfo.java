package com.aaryan.Blogger.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="education")
	private String education;
	
	@Column(name="age")
	private int age;
	
	@Column(name="preferred-genre")
	private String prefferedGenre;
	
	
	@OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
	private List<Blogs> blogsList;


	
	public void addBlogs(Blogs blogs) {
		if(blogsList==null)
			blogsList=new ArrayList<>();
		
		blogsList.add(blogs);
		blogs.setUserinfo(this);
		
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPrefferedGenre() {
		return prefferedGenre;
	}


	public void setPrefferedGenre(String prefferedGenre) {
		this.prefferedGenre = prefferedGenre;
	}


	public List<Blogs> getBlogsList() {
		return blogsList;
	}


	public void setBlogsList(List<Blogs> blogsList) {
		this.blogsList = blogsList;
	}
	
	
	
	
	

}
