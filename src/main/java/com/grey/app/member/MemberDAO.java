package com.grey.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.grey.app.util.DBConnection;

public class MemberDAO {
	
	private DBConnection connection;
	public MemberDAO() {
		this.connection = new DBConnection();
	}


	public int join(MemberDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = """
				INSERT INTO MEMBER
				VALUES (?,?,?,?)
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getEmail());
		
		int result = ps.executeUpdate();
		
		ps.close();
		con.close();
		
		return result;
	}
	
	
	public MemberDTO login(MemberDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql ="""
				SELECT * FROM MEMBER
				WHERE ID = ? AND PW = ?
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			dto.setId(rs.getString("ID"));
			dto.setPw(rs.getString("PW"));
			dto.setName(rs.getString("NAME"));
			dto.setEmail(rs.getString("EMAIL"));
			
			ps.close();
			con.close();
			
			return dto;
			
		}
		return null;
	}
	
}
