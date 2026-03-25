package com.grey.app.test.employee;

import com.grey.app.employees.EmployeeDAO;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeDAO dao = new EmployeeDAO();
		try {
			dao.detail(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
