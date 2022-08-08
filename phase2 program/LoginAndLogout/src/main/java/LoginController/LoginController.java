package LoginController;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter pw=response.getWriter();
	String emailId = request.getParameter("emailId");
	String password=request.getParameter("password");
	RequestDispatcher rd2=request.getRequestDispatcher("index.html");
	RequestDispatcher rd1=request.getRequestDispatcher("Home");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Prateek#1974");
		System.out.println("successfully");
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Login WHERE emailId=? and password=?");
		pstmt.setString(1, emailId);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next())
		{
			pw.println("successfully login");
			request.setAttribute("obj", emailId);
			rd1.include(request, response);
			
		}
		else {
			pw.println("failure try once again");
			rd1.include(request, response);
		}
		
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String emailId = request.getParameter("emailId");
		String password=request.getParameter("password");
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Prateek#1974");
			PreparedStatement pstmt = con.prepareStatement("insert into login value (?,?)");
			pstmt.setString(1, emailId);
			pstmt.setString(2, password);
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				pw.println("Account createdsuccessfully");
				
			}
			else {
				pw.println("failure try once again");
			}
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		rd.include(request, response);
	}

}
