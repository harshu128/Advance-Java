package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		
		String roll_no=request.getParameter("Roll_No");
		System.out.println(roll_no);
		String name=request.getParameter("name");
		System.out.println(name);
		String course=request.getParameter("course");
		System.out.println(course);
		String duration=request.getParameter("duration");
		System.out.println(duration);
		String age=request.getParameter("age");
		System.out.println(age);
		

		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		request.setAttribute("Roll_no", roll_no);
		request.setAttribute("name", name);
		request.setAttribute("course", course);
		request.setAttribute("duration", duration);
		request.setAttribute("age", age);
		try {
			rd.forward(request, response);
		}catch(Exception e) {
			System.out.println("Exception occured :"+e);
			
		}	
	}
}
		
		
		/*
		  try {
		 
		rd.forward(request, response);
	}catch(Exception e) {
		System.out.println("Exception occured :"+e);
		

		RequestDispatcher rd1=request.getRequestDispatcher("result.jsp");
		request.setAttribute("name", name);
		try {
		rd.forward(request, response);
	}catch(Exception e1) {
		System.out.println("Exception occured :"+e1);
		

		RequestDispatcher rd2=request.getRequestDispatcher("result.jsp");
		request.setAttribute("course", course);
		try {
		rd.forward(request, response);
	}catch(Exception e2) {
		System.out.println("Exception occured :"+e2);
		

		RequestDispatcher rd3=request.getRequestDispatcher("result.jsp");
		request.setAttribute("duration", duration);
		try {
		rd.forward(request, response);
	}catch(Exception e3) {
		System.out.println("Exception occured :"+e3);
		
		
		RequestDispatcher rd4=request.getRequestDispatcher("result.jsp");
		request.setAttribute("age", age);
		try {
		rd.forward(request, response);
	}catch(Exception e4) {
		System.out.println("Exception occured :"+e4);
		
		
	}
	}
}
}}}}*/