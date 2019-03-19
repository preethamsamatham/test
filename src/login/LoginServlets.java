package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlets
 */
@WebServlet("/LoginServlets")
public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlets() {
    	
        super();
        //System.out.println("hi");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at	: ").append(request.getContextPath());
		//System.out.println("Hello!");
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//session
		HttpSession session=request.getSession();
		session.setAttribute("session",username);
		
		//System.out.println("hello");
		
		
		Connection con=Login1.getConnection();
		if(Login1.validate(username,password,con)) {
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}

		
		
		
		/*PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("<html>");
		pw.print("<h5 style=color:red>Your password and username dont match</h5>");
		pw.print("</html>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.toLowerCase().equals("admin")&& password.toLowerCase().equals("admin")) {
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
		
		pw.print(username);
		/*pw.print("<br/>");
		pw.print("<form action=LoginAgain >");
		pw.print("<input type=text  name=password value="+password+" />");
		pw.print("<button type=submit>submit</button>");
		pw.print("<span id=date></span>");
		pw.print("</form>");
		
		pw.print("<script>");
		pw.print("setInterval(see,1000);");
		pw.print("function see(){ document.getElementById(\"date\").innerHTML = Date();}");
		pw.print("</script>");*/
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
