package com.blog.sang.common.enumeration;

import lombok.Getter;

@Getter
public enum RegularExpressionType {

	// 사용, 미사용
	HANGEUL("", ""),
	NUMBER("^[0-9]$", "^[^0-9]$");
	
	
	private String use;
	private String disuse;
	
	private RegularExpressionType(String use, String disuse) {
		this.use = use;
		this.disuse = disuse;
	}
	
}
