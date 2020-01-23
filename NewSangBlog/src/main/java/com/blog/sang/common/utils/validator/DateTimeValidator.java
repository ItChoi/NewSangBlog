package com.blog.sang.common.utils.validator;

import com.blog.sang.common.exception.InvalidDateTimeException;
import com.blog.sang.common.utils.converter.DelimiterConverter;
import com.blog.sang.common.utils.date.DateTimeUtils;

public class DateTimeValidator {
	
	public static String validDateTimePattern(String dateTime) {
		
		String temp = dateTime;
		temp = DelimiterConverter.convertOriginalDateTimePattern(temp);
		
		if (temp.length() != DateTimeUtils.DATE_TIME_LENGTH) {
			throw new InvalidDateTimeException("invalid DateTime pattern.");
		}
		
		return dateTime;
	}

}
