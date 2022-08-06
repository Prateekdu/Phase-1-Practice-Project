package CookieTrackingDemo;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class CookieDashboard
 */
@WebServlet("/CookieDashboard")
public class CookieDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieDashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie cookie = null;
        Cookie[] cookies = null;
        boolean found = false;
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
        cookies = request.getCookies();
        if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                if (cookie.getName().contentEquals("userid") && cookie.getValue() != null) {
                    out.println("UserId read from cookie:" + cookie.getValue() + "<br>");
                    found = true;
                }
             }
        }
        if (!found) {
            out.println("No UserId was found in cookie.<br>");
        }
        out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
