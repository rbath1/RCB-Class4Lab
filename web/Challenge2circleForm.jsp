<%-- 
    Document   : Challenge2circleForm
    Created on : Feb 2, 2013, 1:29:13 AM
    Author     : Bob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Area of a Circle</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
function validateForm()
{
var x=document.forms["formCircle"]["radius"].value;
if (x==null || x=="" || x<0 || isNaN(x)==true)
  {
  alert("Input is invalid.");
  return false;
  }
}
</script>
    </head>
    <body>
        <h1 align="center">Calculate Area of a Circle</h1>
         <form id="formCircle" action="something.do" name="formCircle" method="POST" onsubmit="return validateForm()">
            
            radius: <input type="number" id="radius" name="radius"><br />
            
         </br></br>
         <input type="submit" value="Calculate">
         </br></br>
        </form>
        <% 
           if (request.getAttribute("Answer")!=null){
             String answer = request.getAttribute("Answer").toString();
             out.println("The Area is: " + answer);
           }
           
        %>
        <br />
        <br />
        <a href="index.jsp">Back</a>
    </body>
</html>

