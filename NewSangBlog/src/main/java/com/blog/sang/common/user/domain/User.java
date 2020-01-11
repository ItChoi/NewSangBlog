package com.blog.sang.common.user.domain;

import com.blog.sang.common.domain.CommonDomain;
import com.blog.sang.common.domain.support.PhoneNumbers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends CommonDomain {
	private long id;	
	private String loginId;
	private String password;
	private PhoneNumbers phoneNumbers;
	private String name;
	private String introduce;
	private String imageName;
	private String lastLoginDate;
	
	public User() { 
		
	}

	public User(long id, String loginId, String password, PhoneNumbers phoneNumbers, String name, String introduce, String imageName, String lastLoginDate) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.phoneNumbers = phoneNumbers;
		this.name = name;
		this.introduce = introduce;
		this.imageName = imageName;
		this.lastLoginDate = lastLoginDate;
	}
	
	
	
	
	
	

}
