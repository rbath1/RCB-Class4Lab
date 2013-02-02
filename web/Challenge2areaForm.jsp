<%-- 
    Document   : Challenge2areaForm
    Created on : Feb 2, 2013, 12:00:25 AM
    Author     : Bob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <title>Area of a Rectangle</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
function validateForm()
{
var x=document.forms["formArea"]["length"].value;
var y=document.forms["formArea"]["width"].value;
if (x==null || y==null || x=="" || y=="" || x<0 || y<0 || isNaN(x)==true || isNaN(y)==true)
  {
  alert("Input is invalid.");
  return false;
  }
 
}

</script>
    </head>
    <body>
         <h1 align="center">Calculate Area of a Rectangle/Square</h1>
        <form id="formArea" action="something.do" name="formArea" method="POST" onsubmit="return validateForm()">
            
            length: <input type="number" id="length" name="length"><br />
            width: <input type="number" id="width" name="width">
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
