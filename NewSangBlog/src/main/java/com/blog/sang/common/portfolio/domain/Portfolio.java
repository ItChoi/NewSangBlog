package com.blog.sang.common.portfolio.domain;

import java.util.List;

import com.blog.sang.common.domain.SuperDomain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Portfolio extends SuperDomain {
	private long id;
	private long userId;
	private String imageName;
	private String title;
	private String summary;
	private String content;
	private String url;
	private String zipFile;
	private String featured;
	private String displayFlag;
	private String forcedDisplayFlag;
	private List<PortfolioPiece> portfolioPieces;
	private List<PortfolioEnvironment> portfolioEnvironments;
	
	public Portfolio(long id, long userId, String imageName, String title, String summary, String content, String url,
			String zipFile, String featured, String displayFlag, String forcedDisplayFlag,
			List<PortfolioPiece> portfolioPieces, List<PortfolioEnvironment> portfolioEnvironments) {
		super();
		this.id = id;
		this.userId = userId;
		this.imageName = imageName;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.url = url;
		this.zipFile = zipFile;
		this.featured = featured;
		this.displayFlag = displayFlag;
		this.forcedDisplayFlag = forcedDisplayFlag;
		this.portfolioPieces = portfolioPieces;
		this.portfolioEnvironments = portfolioEnvironments;
	}
	
}
