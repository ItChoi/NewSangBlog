package com.blog.sang.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

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

		String result = "2020-01-15 14:53:22";
		
		// 숫자4-숫자2-숫자2 숫자2:숫자2:숫자2
		String dateDelimiter = "-";
		String timeDelimiter = ":";
		String regEx1 = "^\\d{4}" + dateDelimiter + "\\d{2}" + dateDelimiter + "\\d{2}"
						+ " " + "\\d{2}" + timeDelimiter + "\\d{2}" + timeDelimiter + "\\d{2}$";
		// 온리 숫자 length 14
		String regEx2 = "^[0-9]{14}$";
		
		String val = "20200115083551";
		// System.out.println("test1: " + val.matches(regEx2));
		System.out.println("test2: " + result.matches(regEx1));
		
		/**
		Pattern pattern = Pattern.compile(regEx2);
		Matcher matcher = pattern.matcher("202001152123131");

		while(matcher.find()) {
			System.out.println("matcher: " + matcher.group());
		}
		 */
		
	}

}
