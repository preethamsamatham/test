package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SucessServlet
 */
@WebServlet("/SucessServlet")
public class SucessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SucessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("firstname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String lastname = request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String cities1=request.getParameter("cities1");
		String cities2=request.getParameter("cities2");
		String address=request.getParameter("comments");
		String technologies[] =request.getParameterValues("tech");
		//String cc[]=request.getParameterValues("cities");
		if (technologies != null) {
		pw.print("<html>");
//		pw.print("<h1 style=color:green>You have Sucessfully Logged IN!!</h1>");
		pw.print("</html>");
//		pw.print("<img src=http://www.pngmart.com/files/4/Party-Transparent-Background.png/>");
		pw.print("<span>Firstname: "+username+"</span><br/>");
		pw.print("<span>Lastname: "+lastname+"</span><br/>");
		pw.print("<span>Email: "+email+"</span><br/>");
		pw.print("<span>Password: "+password+"</span><br/>");
		pw.print("<span>Gender: "+gender+"</span><br/>");
		if(cities1==null&&cities2==null) {
			pw.print("<span>Cities:no cities selected</span><br/>");
		}
		else if(cities1==null) {
		pw.print("<span>Cities: "+cities2+"</span><br/>");
		}
		else if(cities2==null) {
			pw.print("<span>Cities: "+cities1+"</span><br/>");
		}
		else {
			pw.print("<span>Cities: "+cities1+","+cities2+"</span><br/>");
		}
		pw.print("<span>Address: "+address+"</span><br/>");
		System.out.println("outside if");
		
		if (technologies != null) {
			//System.out.println("inside if");
			pw.print("<span>Technologies: </span>");
			// System.out.println(technologies);
			for (int i = 0; i < technologies.length; i++) {
		 pw.print(technologies[i]+"<span> </span>");
		// System.out.println(technologies[i]);
	}}
	
		
		}
		else {
			pw.print("<span style=color:red>*No Technologies Selected </span>");
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
			rd.include(request, response);
			
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
