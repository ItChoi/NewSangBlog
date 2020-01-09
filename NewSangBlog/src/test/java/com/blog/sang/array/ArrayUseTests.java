package com.blog.sang.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.blog.sang.common.domain.support.PhoneNumbers;
import com.blog.sang.common.user.domain.User;


public class ArrayUseTests {
	

	@Test
	public void 배열_사용() {
		
		User user = new User(1, "", "", PhoneNumbers phoneNumbers, "", "", "", "");
		
		PhoneNumbers asd = new PhoneNumbers();
		assertEquals("", asd.getPhoneNumber());
		
		
	}
	
}
