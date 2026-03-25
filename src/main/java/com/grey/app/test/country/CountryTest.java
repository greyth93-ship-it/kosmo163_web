package com.grey.app.test.country;

import com.grey.app.countries.CountriesDAO;

public class CountryTest {

	public static void main(String[] args) {
		

		CountriesDAO dao = new CountriesDAO();
		try {
			dao.detail("IL");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
