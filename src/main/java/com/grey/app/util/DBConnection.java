package com.grey.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection getConnection() throws Exception {
		String user = "hr";
		String passwrod = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver); // java에게 사용할 DB 드라이버의 존재를 알리고 메모리에 올리는 작
		
		Connection con = DriverManager.getConnection(url, user, passwrod); // 실전화기의 종이컵 역할
		
		return con;
		
	}
	
}
