package com.aaryan.Blogger.Domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blogs")
public class Blogs {
	


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="blogid")
	private int id;
	
	@Column(name="heading")
	private String heading;
	
	@Column(name="body")
	private String body;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.EAGER)
	@JoinColumn(name="user_info_id")
	private UserInfo userinfo;

	
	
	
	
	public Blogs() {
		
	}

	public Blogs(String heading, String body, UserInfo userinfo) {
		
		this.heading = heading;
		this.body = body;
		this.userinfo = userinfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

}
