package com.yash.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	


	private Connection connection=null;
	private DataSource dataSource=null;
	public ConnectionManager(DataSource dataSource) {
     this.dataSource=dataSource;
	}
	public Connection openConnection() {
		try {
			Class.forName(dataSource.getDriver());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
		}
	}

}
