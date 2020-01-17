package com.blog.sang.common.utils.validator;

import com.blog.sang.common.utils.converter.DelimiterConverter;
import com.blog.sang.common.utils.date.DateTimeUtils;

public class DateTimeValidator {
	
	public static boolean validDateTimePattern(String dateTime) {
		boolean checkDateTime = true;
		
		String temp = dateTime;
		temp = DelimiterConverter.convertWhiteSpaceBy(temp, true);
		
		if (temp.length() != DateTimeUtils.DATE_TIME_LENGTH) {
			checkDateTime = false;
		}
		
		return checkDateTime;
	}

}
