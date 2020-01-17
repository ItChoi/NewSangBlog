package com.blog.sang.regex;

import org.junit.jupiter.api.Test;

import com.blog.sang.common.enumeration.DateTimePattern;
import com.blog.sang.common.utils.date.DateTimeUtils;

public class RegularExpressionTest {
	
	@Test
	public void 한글체크_정규식_테스트() {
		String test1 = "asdasd한글sadasdasd";
		String test2 = "sadasdasdasdasd";
		String test3 = "asdasd:asdasdasd";
		String test4 = "-asdasd-sdasdasd-";
		String test5 = "asdasd-asdas:asd한sad글:";
		
		/**
		 * 정규식 적용
		 * - 가능
		 * 		1. 띄어쓰기
		 * 		2. :
		 * 		3. -
		 * 
		 * - 불가능
		 * 		1. 한글
		 * 		2. 특수 문자
		 * 
		 * - 로직
		 * 		1. 숫자4-숫자2-숫자2 숫자2:숫자2:숫자2
		 * 		2. 온리 숫자 14
		 * 
		 */

		String result1 = "2020-01-15 14:53:22";
		String result2 = "20200115083551";
		String result3 = "aaaaaaaaaaaaaa";
		
		
		// 숫자4-숫자2-숫자2 숫자2:숫자2:숫자2
		String dateDelimiter = "-";
		String timeDelimiter = ":";
		String regEx1 = "^\\d{4}" + dateDelimiter + "\\d{2}" + dateDelimiter + "\\d{2}"
						+ " " + "\\d{2}" + timeDelimiter + "\\d{2}" + timeDelimiter + "\\d{2}$";
		// 온리 숫자 length 14
		String regEx2 = "^[^0-9]{14}$";
		
		// System.out.println("test1: " + val.matches(regEx2));
		// System.out.println("test2: " + result3.matches(regEx2));
		String testValue = DateTimeUtils.nowDateTime(DateTimePattern.DATE_TIME.getFormatPattern());
		System.out.println("testValue: " + testValue);
		
		// System.out.println("test3: " + DelimiterConverter.convertWhiteSpaceBy("", ""));
		/**
		Pattern pattern = Pattern.compile(regEx2);
		Matcher matcher = pattern.matcher("202001152123131");

		while(matcher.find()) {
			System.out.println("matcher: " + matcher.group());
		}
		 */
		
	}

}
