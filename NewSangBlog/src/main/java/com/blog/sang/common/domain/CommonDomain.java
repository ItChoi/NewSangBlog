package com.blog.sang.common.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonDomain {
	private String createdDate;
	private String updatedDate;
	private String createdLoginId;
	private String updatedLoginId;
	
	public CommonDomain() {
		this(null, null, null, null);
	}
	
	
	public CommonDomain(String createdDate, String updatedDate, String createdLoginId, String updatedLoginId) {
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdLoginId = createdLoginId;
		this.updatedLoginId = updatedLoginId;
	}


	
	
}
