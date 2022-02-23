package com.revature.helloServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go-to-google")
public class GoogleForMeServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("Init has been called for GoogServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("https://www.google.com");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("GoogServlet Destroyer");
	}

}
