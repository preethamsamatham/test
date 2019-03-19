<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,login.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String username=request.getParameter("username");%>

Admin<label><%=request.getParameter("username")%></label><br/>

<%-- <%/
 String[] technologies=request.getParameterValues("tech");
String tech="";
for(int i=0;i<technologies.length;i++){
	tech= tech+""+technologies[i];
	}
%> --%>
<table border=2>
<tr>
<th>FirstName</th><th>Lastname</th><th>Technologies</th></tr>
<%
ArrayList<User> a1=(ArrayList)request.getAttribute("userlist");
Iterator<User> itr=a1.iterator();
while(itr.hasNext()){
	User usr=itr.next();
	%>
	<tr><td><%=usr.getFirstname()%></td>
		<td><%=usr.getLastname()%></td>
		<td><%
		String tech="";
	for(int i=0;i<usr.getTechnologies().length;i++){
		tech= tech+""+usr.getTechnologies()[i];
	} %><%=tech%>
	</td>
	</tr>
<%}%>



</table>
<script>

</script>
</body>
</html>