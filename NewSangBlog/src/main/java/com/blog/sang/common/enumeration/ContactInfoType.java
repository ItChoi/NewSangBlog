package com.blog.sang.common.enumeration;


import com.blog.sang.common.support.PhoneNumbers;

import lombok.Getter;

@Getter
public enum ContactInfoType {

	FIRST_PHONE_NUMBERS(PhoneNumbers.FIRST_PHONE_NUMBERS);
	
	private String[] values;

	private ContactInfoType(String[] values) {
		this.values = values;
	}

}
