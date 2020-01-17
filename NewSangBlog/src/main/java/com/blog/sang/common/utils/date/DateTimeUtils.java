package com.blog.sang.common.utils.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.blog.sang.common.enumeration.DateTimePattern;
import com.blog.sang.common.exception.InvalidDateTimeException;
import com.blog.sang.common.utils.validator.DateTimeValidator;

public class DateTimeUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(DateTimeUtils.class);
	
	public static final int DATE_TIME_LENGTH = 14;
	public static final int DATE_LENGTH = 8;
	public static final int TIME_LENGTH = 6;
	
	public static String nowDateTime() {
		return LocalDateTime.now().format(
				DateTimeFormatter.ofPattern(DateTimePattern.DATE_TIME.getOriginalPattern()));
	}
	
	public static String nowDateTime(String pattern) {
		
		String nowDateTime = LocalDateTime.now().format(
				DateTimeFormatter.ofPattern(pattern));

		// nowDateTime에서 구분자 찾기, 빈 공간 제거 값 넘기기 TODO:: 정규식 패턴 정하기~
		if (!DateTimeValidator.validDateTimePattern(nowDateTime)) {
			throw new InvalidDateTimeException("invalid DateTime pattern.");
		}
		
		return nowDateTime;
	}
	
	public static final String nowDateTime(String dateDelimiter, String timeDelimiter) {
		String date = nowDate(dateDelimiter);
		String time = nowTime(timeDelimiter);
		return date + " " + time;
	}
	
	public static final String nowDate(String dateDelimiter) {
		String datePattern = "yyyy" + dateDelimiter + "MM" + dateDelimiter + "dd";
		return LocalDate.now().format(DateTimeFormatter.ofPattern(datePattern));
	}
	
	public static final String nowTime(String timeDelimiter) {
		String timePattern = "HH" + timeDelimiter + "mm" + timeDelimiter + "ss";
		return LocalTime.now().format(DateTimeFormatter.ofPattern(timePattern));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
