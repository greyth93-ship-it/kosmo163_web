package com.grey.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import com.grey.app.util.DBConnection;

public class CountriesDAO {
	
	
	
	public CountryDTO detail (String countryName) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = """
				SELECT * FROM COUNTRIES 
				WHERE COUNTRY_ID = ?
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, countryName);
		
		ResultSet rs = ps.executeQuery();
		CountryDTO dto = null;
		if (rs.next()) {
			dto = new CountryDTO();
			dto.setCountryId(rs.getString("COUNTRY_ID"));
			dto.setCountryName(rs.getString("COUNTRY_NAME"));
			dto.setRegionId(rs.getInt("REGION_ID"));
		} 
		
		rs.close();
		ps.close();
		con.close();

		return dto;
				
	}

	public ArrayList<CountryDTO> list() throws Exception {
		
		
		
		// DB 연결
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		// 쿼리문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//쿼리문 미리 전송
		PreparedStatement ps = con.prepareStatement(sql);
		
		// 쿼리문 전송
		ResultSet rs = ps.executeQuery();
		
		ArrayList<CountryDTO> ar = new ArrayList<>();
		while (rs.next()) {
			CountryDTO dto = new CountryDTO();
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			int ri = rs.getInt("REGION_ID");
			
			dto.setCountryId(id);
			dto.setCountryName(name);
			dto.setRegionId(ri);
			
			ar.add(dto);
			
			
		} 
		
		// 종료
		rs.close();
		ps.close();
		con.close();
		
		return ar;
		
	}
}
