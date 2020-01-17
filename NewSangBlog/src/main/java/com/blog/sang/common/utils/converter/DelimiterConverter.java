package com.blog.sang.common.utils.converter;

import org.springframework.util.StringUtils;

public class DelimiterConverter {
	
	public static String convertWhiteSpaceBy(String value, boolean removeAllSpaceBar, String ... delimiters) {
		
		if (!StringUtils.isEmpty(removeAllSpaceBar) && removeAllSpaceBar == true) {
			removeAllSpaceBar(value);
		}
		
		for (String delimiter : delimiters) {
			value = value.replaceAll(delimiter, "");
		}
		
		return value;
	}
	
	public static String removeAllSpaceBar(String value) {
		return value = value.replaceAll(" ", "").trim();
	}
	
	
	
	
	

}
