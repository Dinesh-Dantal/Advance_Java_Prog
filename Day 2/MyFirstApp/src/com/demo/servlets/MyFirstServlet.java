package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("In init method");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hello World from servlet!!!</h1>");
	}
	public void destroy() {
		System.out.println("in destroy method");
	}

}
