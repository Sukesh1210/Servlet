package com.jspiders.servlets.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student_info")
public class StudentInfo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long mobile=Long.parseLong(req.getParameter("mobile"));
		int age=Integer.parseInt(req.getParameter("age"));
		String[] courses = req.getParameterValues("courses");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>id="+id+"</h1>");
		writer.println("<h1>id="+name+"</h1>");
		writer.println("<h1>id="+email+"</h1>");
		writer.println("<h1>id="+mobile+"</h1>");
		writer.println("<h1>id="+age+"</h1>");
		for(int i=0;i<courses.length;i++) {
			writer.println("<h1>"+courses[i]+"</h1>");
		}
		
	}

}
