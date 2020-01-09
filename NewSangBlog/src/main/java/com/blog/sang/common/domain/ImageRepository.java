package com.blog.sang.common.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageRepository extends SuperDomain {
	private long id;
	private long userId;
	private String imageType;
	private String imageName;
	
	public ImageRepository() {
		
	}

	public ImageRepository(long id, long userId, String imageType, String imageName) {
		super();
		this.id = id;
		this.userId = userId;
		this.imageType = imageType;
		this.imageName = imageName;
	}
	
	
}
