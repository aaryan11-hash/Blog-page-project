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
public class UserInfo implements Comparable<UserInfo> {
	
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
	
	
	
	
	
	
	public UserInfo(int usefulid, String username, String password, String firstname, String lastname, String education,
			int age, String prefferedGenre, List<Blogs> blogsList) {
		
		
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.education = education;
		this.age = age;
		this.prefferedGenre = prefferedGenre;
		this.blogsList = blogsList;
	}






	public UserInfo() {
		
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

	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", education=" + education + ", age=" + age + ", prefferedGenre="
				+ prefferedGenre + "]";
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((blogsList == null) ? 0 : blogsList.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((prefferedGenre == null) ? 0 : prefferedGenre.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (age != other.age)
			return false;
		if (blogsList == null) {
			if (other.blogsList != null)
				return false;
		} else if (!blogsList.equals(other.blogsList))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (prefferedGenre == null) {
			if (other.prefferedGenre != null)
				return false;
		} else if (!prefferedGenre.equals(other.prefferedGenre))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}






	@Override
	public int compareTo(UserInfo o) {
		if(this.id>o.getId())
			return 1;
		else 
			return -1;
		
	}
	
	
	
	
	

}
