package com.blog.sang.manager.menu.domain;

import com.blog.sang.common.domain.CommonDomain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Menu extends CommonDomain {
	private long id;
	private long parentId;
	private String menuLevel;
	private String menuCode;
	private String menuName;
	private String ordering;
	private String url;
	private String uri;
	private String menuDisplay;
	private String menuType;
	
	public Menu() {
		
	}
	
	public Menu(long id, long parentId, String menuLevel, String menuCode, String menuName, String ordering, String url,
			String uri, String menuDisplay, String menuType) {
		this.id = id;
		this.parentId = parentId;
		this.menuLevel = menuLevel;
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.ordering = ordering;
		this.url = url;
		this.uri = uri;
		this.menuDisplay = menuDisplay;
		this.menuType = menuType;
	}
	
	
	

}
