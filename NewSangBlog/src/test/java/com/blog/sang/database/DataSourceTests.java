package com.blog.sang.database;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	/**
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	*/
	
	//@Setter(onMethod_ = { @Autowired })
	@Autowired
	private DataSource dataSource;
	
	// @Setter(onMethod_ = { @Autowired })
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnection() {
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:root-context.xml");
		//DataSource ds = (DataSource) ctx.getBean("dataSource", DataSource.class);
		
		try (Connection conn = dataSource.getConnection()) {
		// try (Connection conn = ds.getConnection()) {		
			log.info("conn: " + conn);
			
			
		} catch (Exception e) {
			log.error(e);
		}
	}

}
