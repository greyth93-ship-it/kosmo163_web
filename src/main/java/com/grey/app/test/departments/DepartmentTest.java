package com.grey.app.test.departments;

import com.grey.app.departments.DepartmentDAO;
import com.grey.app.departments.DepartmentDTO;

public class DepartmentTest {

	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDAO();
		try {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartmentName("Class3");
			dto.setManagerId(null);
			dto.setLocationId(null);
			dao.create(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
