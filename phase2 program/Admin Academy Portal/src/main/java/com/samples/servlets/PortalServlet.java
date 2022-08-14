package com.samples.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.Student;
import com.samples.domain.Subject;
import com.samples.service.StudentService;
import com.samples.service.SubjectService;

@WebServlet("/student")
public class PortalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SubjectService subjectService;
	StudentService studentservice;

	public void init() throws ServletException {
		super.init();
		this.subjectService = new SubjectService();
		this.studentservice=new StudentService();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Student> students = this.studentservice.getStudents();

		request.setAttribute("students", students);

		RequestDispatcher rd = request.getRequestDispatcher("/viewstudents.jsp");
		rd.forward(request, response);

	}


}