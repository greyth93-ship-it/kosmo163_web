package com.grey.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;

import com.grey.app.util.DBConnection;

public class CountriesDAO {
	
	public void detail (String countryName) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = """
				SELECT * FROM COUNTRIES 
				WHERE COUNTRY_ID = ?
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, countryName);
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			String name = rs.getString("COUNTRY_NAME");
			System.out.println(name);
		} else {
			System.out.println("나라가 없다");
		}
		
		rs.close();
		ps.close();
		con.close();

				
	}

	public void list() throws Exception {
		
		// DB 연결
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		// 쿼리문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//쿼리문 미리 전송
		PreparedStatement ps = con.prepareStatement(sql);
		
		// 쿼리문 전송
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_name");
			int ri = rs.getInt("REGIOM_ID");
			System.out.println(id);
		} 
		
		// 종료
		rs.close();
		ps.close();
		con.close();
		
		
	}
}
