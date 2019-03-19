<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
        <title>
            Form
        </title>
    </head>
    <body>
        <form method="post" action="ResgisterServlet" onsubmit="return inSubmit()" >
        <%
        String username = request.getParameter("username");
        session.getAttribute("session");
     
        System.out.println(username);
        String username1=username;
        String password=request.getParameter("password");
     //   System.out.println(password);
        //value=<%=request.getParameter("username")%>
       
           	Hi admin: <label><%=session.getAttribute("session")%></label><br/>
                FirstName         :<input type="text" autofocus id="l1"   placeholder="FirstName" name="firstname"/></br>
               <!--<span id="sp5"> </span><br/>
                <span id="sp6"> </span><br/> -->
                LastName          :<input type="text" id="l2" name="lastname"/><br>
                <!-- <span id="sp8"></span><br/> -->
                Email             :<input type="text" id="em" name="email"/></br>

                PassWord          :<input type="password" id="pws" value=<%=request.getParameter("password")%> name="password" class="ml-3" /><br/>

                Gender    :<input type="radio" name="gender" value="male" class="c1" onchange="displayRadio()"/> Male
                           <input type="radio" name="gender" value="female"  class="c1" onchange="displayRadio()"/> Female
                           <input type="radio" name="gender" value="other"  class="c1" onchange="displayRadio()"/> Other</br>

               <!--              <span id="sp7"> </span>-->
           
        Cities lived in:<input type="checkbox" name="cities1" value="Bengaluru" class="c2 ml-4">Bengaluru
                           <input type="checkbox" name="cities2" value="Hyderabad" class="c2"> Hyderabad</br>
                   Address:<textarea name="comments" size="10" ></textarea></br>
              Technologies:<select multiple name="tech" >
                                <option  value="Python" class="c3">Python</option>
                                <option  value="HTML" class="c3">Html</option>
                                <option  value="CSS" class="c3">Css</option> 
                            </select></br></br>
                        
                <button type="submit" >Submit Form</button> 
                <Button type="reset">Reset Form</Button>
                <button type="button" onclick=" return callMe()">click Me</button>  
                 <span id="sp1"></span>
                    <!-- your name and password is :
               	
                
                </span>  
                gender :
                <span id="sp2">
                
                    </span>  <br/>

                checkbox :
                <span id="sp3"></span><br/>

                dropdown :
                <br/>

                <span id="sp4"></span><br/> -->
                
                
            


        </form>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
    
    <script>
    function inSubmit(){
    	alert("hjh");
    	var flag=false;
    	var ar=document.getElementsByClassName("c3");
    	for(var i=0;i<ar.length;i++){
    	if(ar[i].selected){
    		flag=true;
    		break;
    			}
    	}
    	
    	
    	if(!flag){
    		document.getElementById("sp1").innerHTML="plz select technologies";
    		document.getElementById("sp1").style.color= "red";
    		console.log("hi");
    	//	flag=false; 
    	}
    	console.log(flag);
    	return flag;
    }
    
    
    
    
    </script>
        </body>
        