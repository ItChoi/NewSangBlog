package com.blog.sang.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.blog.sang.common.domain.user.User;
import com.blog.sang.common.enumeration.FirstContactNumbers;
import com.blog.sang.common.support.PhoneNumbers;


public class ArrayUseTests {
	

	@Test
	public void 배열_사용() {
		String[] a = {"1", "2", "3"};
		PhoneNumbers asd = new PhoneNumbers(a);
		
		User user = new User(1, "", "", asd, "", "", "", "");
		String abcd = user.getPhoneNumbers().getPhoneNumber()[0];
		
		assertEquals("1", abcd);
	}
	
	@Test
	public void 이넘_배열_사용() {
		for (String test : FirstContactNumbers.PHONE_NUMBER.getPhoneNumbers()) {
			System.out.println("test: " + test);
		}
	}
}
