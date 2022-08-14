package com.samples.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.Claso;
import com.samples.domain.Student;
import com.samples.domain.Subject;
import com.samples.domain.Teacher;
import com.samples.service.ClasoService;
import com.samples.service.StudentService;
import com.samples.service.SubjectService;
import com.samples.service.TeacherService;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SubjectService subjectService;
	StudentService studentservice;
	ClasoService clasoService;
	TeacherService teacherService;

	public void init() throws ServletException {
		super.init();
		this.subjectService = new SubjectService();
		this.studentservice=new StudentService();
		this.clasoService=new ClasoService();
		this.teacherService=new TeacherService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Claso> clasos = this.clasoService.getClasos();
		List<Teacher> teachers = this.teacherService.getTeachers();
		List<Subject> subjects=this.subjectService.getSubjects();
		List<Student> students = this.studentservice.getStudents();

		request.setAttribute("students", students);
		request.setAttribute("subjects", subjects);
		request.setAttribute("clasos", clasos);
		request.setAttribute("teachers", teachers);

		RequestDispatcher rd = request.getRequestDispatcher("/viewreport.jsp");
		rd.forward(request, response);

	}


}