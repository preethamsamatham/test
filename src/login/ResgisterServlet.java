package login;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResgisterServlet
 */
@WebServlet("/ResgisterServlet")
public class ResgisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResgisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("username1");
		System.out.println(username+"in resser");
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String[] technologies=request.getParameterValues("tech");
		
		Connection con=Login1.getConnection();
		User user =new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setTechnologies(technologies);	
		Login1.insert(user,con);
		
		ArrayList<User> a1=Login1.display(con);
		request.setAttribute("userlist", a1);
		RequestDispatcher rd=request.getRequestDispatcher("Sucess.jsp");
		rd.forward(request, response);
		
		
			
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
