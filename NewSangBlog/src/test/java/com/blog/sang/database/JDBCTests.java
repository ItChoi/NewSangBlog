package com.blog.sang.database;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class JDBCTests {
	
	private static final Logger log = LoggerFactory.getLogger(JDBCTests.class);

	@Test
	@DisplayName("디비 접속 테스트 (url, username, password)")
	void testConnection() {
		try {
			// 내부 프로퍼티 읽기
			Properties properties = new Properties();
			String resource = "properties/application.properties";
			Reader reader = Resources.getResourceAsReader(resource);
			
			properties.load(reader);
			
			Connection conn = DriverManager.getConnection(
					properties.getProperty("jdbc.url"),
					properties.getProperty("jdbc.username"),
					properties.getProperty("jdbc.password")
			);

			
			conn.close();
			reader.close();
			
		} catch (IOException | SQLException e) {
			log.error("{}", e);
		} 
		
	}

}
