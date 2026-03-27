package com.grey.app.countries;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.grey.app.departments.DepartmentDAO;
import com.grey.app.departments.DepartmentDTO;

/**
 * Servlet implementation class CountryDeleteController
 */
@WebServlet("/country/delete")
public class CountryDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("countryId");
		CountryDTO dto = new CountryDTO();
		dto.setCountryId(id);
		CountriesDAO dao = new CountriesDAO();
		try {
			int result = dao.delete(dto);
			
			if (result >0) {
				response.sendRedirect("./list");
			} else {
				response.sendRedirect("./detail?countryId="+id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
