package com.blog.sang.common.user.domain;

import com.blog.sang.common.domain.SuperDomain;
import com.blog.sang.common.domain.support.PhoneNumbers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends SuperDomain {
	private long id;	
	private String loginId;
	private String password;
	private PhoneNumbers phoneNumbers;
	private String name;
	private String introduce;
	private String imageName;
	private String loginDate;
	
	public User() { 
		
	}

	public User(long id, String loginId, String password, PhoneNumbers phoneNumbers, String name, String introduce, String imageName, String loginDate) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.phoneNumbers = phoneNumbers;
		this.name = name;
		this.introduce = introduce;
		this.imageName = imageName;
		this.loginDate = loginDate;
	}
	
	
	
	
	
	

}
