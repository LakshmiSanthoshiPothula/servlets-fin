package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DummyServlet
 */
@WebServlet("/DummyServlet")
public class DummyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		PrintWriter out=response.getWriter();
		out.println("Dummy servlet");
		String s1=(String) request.getAttribute("NAME");
		String s2=(String) request.getAttribute("NATIVEPLACE");
		Date date=(Date) request.getAttribute("TODAY");
	    Integer i1=(Integer) request.getAttribute("AGE");
	    out.println(s1+"<br>"+s2+"<br>"+date+"<br>"+i1);
	    request.removeAttribute("NAME");
	   
	}

}
