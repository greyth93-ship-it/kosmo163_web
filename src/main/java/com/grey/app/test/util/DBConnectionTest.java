package com.grey.app.test.util;

import java.sql.Connection;

import com.grey.app.departments.DepartmentDAO;
import com.grey.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDAO();
		try {
			dao.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
