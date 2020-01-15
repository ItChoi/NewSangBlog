package com.blog.sang.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.blog.sang.common.enumeration.Pattern;
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
		String dateTime1 = DateTimeUtils.nowDateTime(Pattern.DATE_TIME.getFormatPattern());
		String dateTime2 = DateTimeUtils.nowDateTime(Pattern.DATE_TIME.getOriginalPattern());
		
		System.out.println("dateType1: " + dateTime1);
		System.out.println("dateType1-1: " + dateTime1.length());
		System.out.println("dateType2: " + dateTime2);
		System.out.println("dateType2-2: " + dateTime2.length());
		
		
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
	
}
