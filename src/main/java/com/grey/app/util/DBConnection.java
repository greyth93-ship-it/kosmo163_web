package com.grey.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection getConnection() throws Exception {
		String user = "hr";
		String passwrod = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, passwrod); // 실전화기의 종이컵 역할
		
		return con;
		
	}
	
}
