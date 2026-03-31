package com.grey.app.community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.grey.app.util.DBConnection;
import com.sun.source.tree.WhileLoopTree;

public class CommunityDAO {
	
	private DBConnection connection;
	
	public CommunityDAO() {
		this.connection = new DBConnection();
	}
	
	
	
	public CommunityDTO detail(int num) throws Exception {
		Connection con = connection.getConnection();
		
		String sql="""
				SELECT * FROM COMMUNITY WHERE NUM=?
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, num);
		
		ResultSet rs = ps.executeQuery();
		CommunityDTO dto = null;
		if(rs.next()) {
			dto = new CommunityDTO();
			dto.setNum(rs.getLong("NUM"));
			dto.setTitle(rs.getString("TITLE"));
			dto.setName(rs.getString("NAME"));
			dto.setCreateTime(rs.getDate("CREATETIME"));
			dto.setContents(rs.getString("CONTENTS"));
			dto.setStar(rs.getInt("STAR"));
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return dto;
		
		
	}
	
	public ArrayList<CommunityDTO> list() throws Exception {
		Connection con = connection.getConnection();
		
		String sql = """
				SELECT * FROM COMMUNITY
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		ArrayList<CommunityDTO> ar = new ArrayList<>();
		while (rs.next()) {
			CommunityDTO dto = new CommunityDTO();
			dto.setNum(rs.getLong("NUM"));
			dto.setTitle(rs.getString("TITLE"));
			dto.setName(rs.getString("NAME"));
			dto.setCreateTime(rs.getDate("CREATETIME"));
			dto.setContents(rs.getString("CONTENTS"));
			dto.setStar(rs.getInt("STAR"));
			
			ar.add(dto);
			
			
		}
		
		rs.close();
		ps.close();
		con.close();
		
		
		return ar;
	}

}
