package com.blog.sang.common.domain.support;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneNumbers {
	private String[] phoneNumber;

	public PhoneNumbers() {
		
	}
	
	public PhoneNumbers(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
