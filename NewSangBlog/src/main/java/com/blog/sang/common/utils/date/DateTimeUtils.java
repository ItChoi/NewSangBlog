package com.blog.sang.common.utils.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.blog.sang.common.enumeration.Pattern;

public class DateTimeUtils {
	private Pattern pattern;
	private static LocalDateTime localDateTime;
	private LocalDate localDate;
	private LocalTime localTime;
	
	
	// 현재 날짜 가져오기.
	// 입력된 날짜 형식에 맞게 가져오기.
	// 구분자에 따른 날짜도 가져오기.
	
	public static String nowDateTime() {
		return LocalDateTime.now().format(
				DateTimeFormatter.ofPattern(Pattern.DATE_TIME.getFormatPattern()));
	}
	
	public static String nowDateTime(String pattern) {
		/**
		 * 파라미터 pattern 유효성 검증
		 * - 존재하지 않는 pattern으로 와도 데이터 반환
		 * - 검증 방법
		 * 		1. length 비교
		 * 		2. 한글이 들어 간다. (정규식 사용?)
		 * 		3. 
		 * 
		 */
		
		
		
		return LocalDateTime.now().format(
				DateTimeFormatter.ofPattern(pattern));
	}
	
	
}
