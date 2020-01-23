package com.blog.sang.common.utils.converter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import com.blog.sang.common.enumeration.RegularExpressionType;

public class DelimiterConverter {
	
	public static String convertOriginalDateTimePattern(String value) {
		Set<String> set = new HashSet<>();
		
		if (!StringUtils.isEmpty(value)) {
			value = removeAllSpaceBar(value);
		}
		
		Pattern pattern = Pattern.compile(RegularExpressionType.NUMBER.getDisuse());
		Matcher matcher = pattern.matcher(value);

		while (matcher.find()) {
			set.add(matcher.group());
		}
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			value = removeAllDelimiter(value, iterator.next());
		}
		
		
		return value;
	}
	
	public static String removeAllSpaceBar(String value) {
		return value = value.replaceAll(" ", "").trim();
	}
	
	public static String removeAllDelimiter(String value, String ... delimiters) {
		for (String delimiter : delimiters) {
			value = value.replaceAll(delimiter, "");
		}
		return value;
	}
	
	
	
	
	

}
