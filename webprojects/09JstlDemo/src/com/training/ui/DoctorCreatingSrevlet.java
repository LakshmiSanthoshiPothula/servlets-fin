package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Doctor;

/**
 * Servlet implementation class DoctorCreatingSrevlet
 */
@WebServlet("/DoctorCreatingSrevlet")
public class DoctorCreatingSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor doctor1 = new Doctor();
        
        doctor1.setId(101);
        doctor1.setName("puja");
        doctor1.setQualification("MBBS");
        doctor1.setFees(100020.00);
        doctor1.setExperience(21);
        doctor1.setGender("FEMALE");

        
        Doctor doctor2 = new Doctor();
        
        doctor2.setId(102);
        doctor2.setName("bagi");
        doctor2.setQualification("MBBS");
        doctor2.setFees(1000.00);
        doctor2.setExperience(22);
        doctor2.setGender("FEMALE");

        Doctor doctor3 = new Doctor();
        doctor3.setId(103);
        doctor3.setName("Arjun Reddy");
        doctor3.setQualification("MEDICINE");
        doctor3.setFees(100020.00);
        doctor3.setExperience(26);
        doctor3.setGender("MALE");
        
        Doctor doctor4 = new Doctor();
        doctor4.setId(104);
        doctor4.setName("Santhu");
        doctor4.setQualification("MBBS");
        doctor4.setFees(100020.00);
        doctor4.setExperience(21);
        doctor4.setGender("FEMALE");

        
        Doctor doctor5 = new Doctor();
        doctor5.setId(105);
        doctor5.setName("Vidya");
        doctor5.setQualification("MBBS");
        doctor5.setFees(100020.00);
        doctor5.setExperience(21);
        doctor5.setGender("FEMALE");

        
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);
        request.setAttribute("DOCTORS", doctors);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("Display4.jsp");
        dispatcher.forward(request, response);
 

	}

}
