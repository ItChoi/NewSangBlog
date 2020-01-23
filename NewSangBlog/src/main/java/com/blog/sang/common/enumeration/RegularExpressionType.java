package com.blog.sang.common.enumeration;

import lombok.Getter;

@Getter
public enum RegularExpressionType {

	// 사용, 미사용
	HANGEUL("[ㄱ-ㅎ가-힣]", "[^ㄱ-ㅎ가-힣]"),
	NUMBER("[0-9]", "[^0-9]"),
	ENGLISH("[a-zA-Z]", "[^a-zA-Z]")
	;
	
	
	private String use;
	private String disuse;
	
	private RegularExpressionType(String use, String disuse) {
		this.use = use;
		this.disuse = disuse;
	}
	
}
