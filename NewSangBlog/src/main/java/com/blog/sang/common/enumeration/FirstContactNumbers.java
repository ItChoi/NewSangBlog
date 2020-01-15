package com.blog.sang.common.enumeration;


import com.blog.sang.common.support.PhoneNumbers;

import lombok.Getter;

@Getter
public enum FirstContactNumbers {

	PHONE_NUMBER(PhoneNumbers.phonNumbers);
	
	String[] phoneNumbers;

	private FirstContactNumbers(String[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
