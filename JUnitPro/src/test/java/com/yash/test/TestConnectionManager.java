package com.yash.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.helper.ConnectionManager;
import com.yash.helper.DataSource;

public class TestConnectionManager {
	
	private ConnectionManager manager;
	private DataSource dataSource;

	@Before
	public void setUp() throws Exception {
		dataSource=new DataSource();
		dataSource.setDriver("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		manager=new ConnectionManager(dataSource);
	}

	@After
	public void tearDown() throws Exception {
		manager=null;
	}

	@Test
	public void testopenConnectionPositive() {
		Connection connection=manager.openConnection();
		assertNotNull(connection);
	}

	/*@Test
	public void testopenConnectionNegative() {
		dataSource.setUsername("root");
		try {
		Connection connection=manager.openConnection();
		assertNull(connection);
		}catch(Exception e) {
			
		}
	}
	*/
	
}
