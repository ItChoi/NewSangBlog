package com.blog.sang.common.domain.portfolio;

import java.util.List;

import com.blog.sang.common.domain.CommonDomain;
import com.blog.sang.common.domain.image.ImageRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioPiece extends CommonDomain {
	private long id;
	private long portfolioId;
	private String title;
	private List<ImageRepository> imageNames;
	private String content;
	private String url;
	
	public PortfolioPiece(long id, long portfolioId, String title, List<ImageRepository> imageNames, String content,
			String url) {
		super();
		this.id = id;
		this.portfolioId = portfolioId;
		this.title = title;
		this.imageNames = imageNames;
		this.content = content;
		this.url = url;
	}
	
}
