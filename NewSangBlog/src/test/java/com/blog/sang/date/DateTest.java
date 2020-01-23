package com.blog.sang.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import com.blog.sang.common.enumeration.DateTimePattern;
import com.blog.sang.common.enumeration.RegularExpressionType;
import com.blog.sang.common.utils.date.DateTimeUtils;

public class DateTest {
	
	

	@Test
	public void LocalDateTime_테스트01() {
		LocalDateTime ldt = LocalDateTime.of(2020, 1,15, 11, 5, 30);
		
		LocalDateTime ldtNowTest = LocalDateTime.now();
		
		System.out.println(ldt.getYear());
		System.out.println("==================");
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getMonth().getValue());
		System.out.println("==================");
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getDayOfWeek());
		System.out.println("==================");
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println("==================");
		System.out.println(ldtNowTest.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
	}
	
	
	@Test
	public void LocalDate_테스트01() {
		LocalDate ld = LocalDate.of(2020, 1, 15);
		
		LocalDate ldNowTest = LocalDate.now();
		
		System.out.println(ld.getYear());
		System.out.println("==================");
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getMonth().getValue());
		System.out.println("==================");
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek());
	}
	
	@Test
	public void LocalTime_테스트01() {
		LocalTime lt = LocalTime.of(1, 15, 30, 35);
		
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
	}

	@Test
	public void Enum_적용_테스트() {
		// String dateTime1 = DateTimeUtils.nowDateTime("yyyyMMddHHmmss");
		// String dateTime1 = DateTimeUtils.nowDateTime(DateTimePattern.DATE_TIME.getOriginalPattern());
		String dateTime1 = DateTimeUtils.nowDateTime("yyyy-MM-dd HH:mm:ss");
		
		// System.out.println("dateType1zz: " + dateTime1.replaceAll("-", "").replaceAll(" ", "").replaceAll(":", ""));
		System.out.println("dateType1: " + dateTime1);
		System.out.println("dateType1-1: " + dateTime1.length());
		//System.out.println("dateType2: " + dateTime2);
		//System.out.println("dateType2-2: " + dateTime2.length());
		
		
		System.out.println("dateType3: " + LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("asdadasd")).length());
		System.out.println("dateType4: " + LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("asdadasd")));
	}
	
	@Test
	public void LocalDateTime_유효성_검증() {
		System.out.println("test1: " + LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("asdadasd")).length());
		System.out.println("test2: " + LocalDateTime.now().format(
				DateTimeFormatter.ofPattern("asdadasd")));
	}
	
	@Test
	public void 테스트트트() {
		// 
		//Pattern.matches(regex, input);
		String a = "5231ㅇ23123123aaㅁ";
		String[] b = {};
		
		// Pattern pattern = Pattern.compile("("+RegularExpressionType.NUMBER.getDisuse()+")("+ RegularExpressionType.NUMBER.getUse() +")");
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(a);
		
		int i = 0;
		while (matcher.find()) {
			b[i] = matcher.group();
		}
		
		System.out.println("a: " + a);
		
		boolean test2 = Pattern.matches("^[0-9]$", a);
		System.out.println("test2: " + test2);
				
	}
	
	@Test
	public void 구분자_제거_테스트() {
		String dateTime = "2010-04-29 13:23:00";
		
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(dateTime);
		
		
		Set<String> set = new HashSet<>();
		
		while (matcher.find()) {
			set.add(matcher.group());
		}
		
		
		Iterator<String> iterator = set.iterator();
		
		String delimiters = "";
		
		while (iterator.hasNext()) {
			delimiters += iterator.next() + ",";
		}
		
		System.out.println("test : " + delimiters);
		
		String[] result = delimiters.split(",");
		
		for (String asd : result) {
			System.out.println("Result: " + asd);
		}
		
		
	}
	
}
