package com.blog.sang.common.enumeration;

import lombok.Getter;

@Getter
public enum RegularExpression {

	// 사용, 미사용
	HANGEUL("", ""),
	NUMBER("", "");
	
	private String use;
	private String disuse;
	
	private RegularExpression(String use, String disuse) {
		this.use = use;
		this.disuse = disuse;
	}
	
}
