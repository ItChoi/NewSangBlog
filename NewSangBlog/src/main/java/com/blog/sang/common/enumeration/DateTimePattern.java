package com.blog.sang.common.enumeration;

import lombok.Getter;

@Getter
public enum DateTimePattern {
	
	DATE_TIME("yyyyMMddHHmmss", "yyyy-MM-dd HH:mm:ss"),
	DATE("yyyyMMdd", "yyyy-MM-dd"),
	TIME("HHmmss", "HH:mm:ss");
	
	private String originalPattern;
	private String formatPattern;
	
	private DateTimePattern(String originalPattern, String formatPattern) {
		this.originalPattern = originalPattern;
		this.formatPattern = formatPattern;
	}
	
}
