package com.blog.sang.common.portfolio.domain;

import com.blog.sang.common.domain.CommonDomain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioEnvironment extends CommonDomain{
	private long id;
	private long userId;
	private String type;
	private String name;
	private String content;
	
	public PortfolioEnvironment() {
		
	}
	
	public PortfolioEnvironment(long id, long userId, String type, String name, String content) {
		super();
		this.id = id;
		this.userId = userId;
		this.type = type;
		this.name = name;
		this.content = content;
	}
	
	
}
