package login;

import java.sql.*;
import java.util.ArrayList;

public class Login1 {
	
	public static Connection getConnection() {
		try{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vali","root","Preetham@12");
			System.out.println("Sucessfully Connected");
			return con;
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
			return null;
		}
		
	}
	public static boolean validate(String username,String password,Connection con) {
		boolean flag=false;
		try {
			
			String sql="select * from vali.check1 where username=? and password=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			 pstmt.setString(1,username);
			 pstmt.setString(2,password);
			 ResultSet rs =pstmt.executeQuery();
			 while(rs.next()) {
		        	 flag = true;
		        	 break;
		        	
			 }
					}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}


public static void insert(User user,Connection con) {
		 try {
			 //String[] technologies=request.getParameterValues("tech");
			 String tech="";
			 for(int i=0;i<user.getTechnologies().length;i++){
			 	tech= tech+""+user.getTechnologies()[i];
			 	}
			 String sql="insert into vali.check2 values(?,?,?)";
				PreparedStatement pstmt=con.prepareStatement(sql);
				 pstmt.setString(1,user.getFirstname());
				 pstmt.setString(2,user.getLastname());
				 pstmt.setString(3,tech);
				 int i=pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static ArrayList<User> display(Connection con) {
	String sql="select * from vali.check2";
	PreparedStatement pstmt;
	
	
	try {
		pstmt=con.prepareStatement(sql);
		ArrayList<User> a1=new ArrayList<User>();
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			User user=new User();
			user.setFirstname(rs.getString(1));
			user.setLastname(rs.getString(2));
			String[] arr= {rs.getString(3)};
			user.setTechnologies(arr);
			a1.add(user);
			
		}
		return a1;
	}catch(SQLException e){
	  	e.printStackTrace();
		}
	return null;
	
	
}
}
 