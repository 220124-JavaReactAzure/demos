package com.revature.helloServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		value="/anotherOne",
		initParams =  {@WebInitParam(name = "anotherParam", value="just to show it's different")}
		)

public class AnotherServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init has been called for AnotherOneServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().write("<h1>" + this.getServletConfig().getInitParameter("anotherParam") + "</h1>");
		resp.getWriter().write("<h1> Here's another one - DJ Khalid</h1>");
		
		req.getRequestDispatcher("/test").forward(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("AnotherOneServlet Destroyer");
	}

	
	
}
