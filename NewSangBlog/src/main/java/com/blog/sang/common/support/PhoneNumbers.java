package com.blog.sang.common.support;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneNumbers {
	private String[] phoneNumber;
	
	public static final String[] phonNumbers = {"010", "011", "016", "017", "019"};

	public PhoneNumbers() {
		
	}
	
	public PhoneNumbers(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
