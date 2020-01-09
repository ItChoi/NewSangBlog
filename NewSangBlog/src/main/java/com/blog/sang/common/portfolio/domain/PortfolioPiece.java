package com.blog.sang.common.portfolio.domain;

import java.util.List;

import com.blog.sang.common.domain.ImageRepository;
import com.blog.sang.common.domain.SuperDomain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioPiece extends SuperDomain {
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
