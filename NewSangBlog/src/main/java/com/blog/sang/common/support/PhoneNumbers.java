package com.blog.sang.common.support;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneNumbers {
	
	public static final String[] FIRST_PHONE_NUMBERS = {
			"010", "011", "016", "017", "019"
	};
	
	// [0]: 앞 번호, [1]: 가운데 번호, [2]: 끝 번호
	private String[] phoneNumber;

	public PhoneNumbers() {
		
	}
	
	public PhoneNumbers(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
