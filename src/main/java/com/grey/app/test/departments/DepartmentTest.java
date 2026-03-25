package com.grey.app.test.departments;

import com.grey.app.departments.DepartmentDAO;

public class DepartmentTest {

	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDAO();
		try {
			dao.detail(200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
