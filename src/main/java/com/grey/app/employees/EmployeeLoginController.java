package com.grey.app.employees;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class EmployeeLoginController
 */
@WebServlet("/emp/login")
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/emp/login.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("employeeId");
		String pw = request.getParameter("password");
//		int i = Integer.parseInt(id);
//		System.out.println(i);
//		System.out.println(pw);
		
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmployeeId(Integer.parseInt(id));
		dto.setPassword(pw);
		
		EmployeeDAO dao = new EmployeeDAO();
		try {
				dto = dao.login(dto);
			if (dto != null) {
				System.out.println("OK");

			} else {
				System.out.println("FAIL");
				
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("dto", dto);
			
			
			
			response.sendRedirect("/home");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
