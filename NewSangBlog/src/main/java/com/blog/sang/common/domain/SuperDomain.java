package com.blog.sang.common.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuperDomain {
	private String createdDate;
	private String updatedDate;
	private String createdLoginId;
	private String updatedLoginId;
	
	public SuperDomain() {
		
	}
	
	public SuperDomain(String createdDate, String updatedDate, String createdLoginId, String updatedLoginId) {
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdLoginId = createdLoginId;
		this.updatedLoginId = updatedLoginId;
	}
	
	
}
