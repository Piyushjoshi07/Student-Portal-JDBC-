package com.newpackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Index2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		String password= request.getParameter("password");
		if(id.equals("Piyush") && password.equals("ucm1234"))
		{
			HttpSession a = request.getSession();
			a.setAttribute("id", id);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			
			response.sendRedirect("index.jsp");
		}

	}
}
