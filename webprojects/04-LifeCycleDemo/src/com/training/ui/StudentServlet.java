package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(
		urlPatterns = { "/StudentServlet" }, 
		initParams = { 
				@WebInitParam(name = "i_rollnumber", value = "102"), 
				@WebInitParam(name = "i_name", value = "sanju"), 
				@WebInitParam(name = "i_age", value = "22")
		})
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int rollNumber;
	private String name;
	private int age;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<br>Roll number:"+this.rollNumber);
		out.println("<br>Name:"+this.name);
		out.println("<br>Age:"+this.age);
	}
	@Override
	public void init() throws ServletException {
     ServletConfig config=getServletConfig();//when we need init params or to getsrvlet context
     String strRoll=config.getInitParameter("i_rollnumber");
     String strName=config.getInitParameter("i_name");
     String strAge=config.getInitParameter("i_age");
     this.rollNumber=Integer.parseInt(strRoll);
     this.age=Integer.parseInt(strAge);
     name=strName;
     
     
     
	}

}
