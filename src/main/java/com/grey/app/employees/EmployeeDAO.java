package com.grey.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.grey.app.util.DBConnection;

public class EmployeeDAO {
	
	private DBConnection connection;
	
	public EmployeeDAO() {
		this.connection = new DBConnection();
	}
	
	// 로그인 검증
	public EmployeeDTO login(EmployeeDTO dto) throws Exception {
		
		Connection con = connection.getConnection();
		
		String sql = """
				SELECT * FROM EMPLOYEES
				WHERE EMPLOYEE_ID = ? AND PASSWORD =?
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, dto.getEmployeeId());
		ps.setString(2, dto.getPassword());
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			dto.setFirstName(rs.getString("FIRST_NAME"));
			dto.setLastName(rs.getString("LAST_NAME"));
			dto.setHireDate(rs.getDate("HIRE_DATE"));
			dto.setSalary(rs.getDouble("SALARY"));
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			
			return dto;
		} 
		
		return null;
		
	}
	
	
	
	
	
	public void detail (int employeeId) throws Exception {
		
		Connection con = connection.getConnection();
		
		String sql = """
				SELECT * FROM EMPLOYEES 
				WHERE EMPLOYEE_ID = ?
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, employeeId);
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			String name = rs.getString("FIRST_NAME");
			int id = rs.getInt("EMPLOYEE_ID");
			System.out.println(name);
			
		} else {
			System.out.println("없다");
		}
		rs.close();
		ps.close();
		con.close();
	}

	public void list () throws Exception {
		
		Connection con = connection.getConnection();
		
		String sql = """
				SELECT * FROM EMPLOYEES
				""";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String name = rs.getString("FIRST_NAME");
			System.out.println(name);
		} 
			
		
		rs.close();
		ps.close();
		con.close();
		
		
	}
}
