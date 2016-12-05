<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
  </head>
  
  <body>
    *****测试******* <br>
    <%
    for(int i=1;i<=9;i++){
    for(int j=1;j<=i;j++){
    %>
    <%=i %>*<%=j %>=<%=i*j %> &nbsp;&nbsp;&nbsp;
   <%}
    %>
    <br />
    <%}
     %>
     <br />
     <%
     
     for(int i = 0;i<5;i++){
     for(int j = -3;j<4;j++){
     if(i>Math.abs(j)){
     out.println("*");
     }else{
     out.println("&nbsp");
     }
     }
     out.println("<br />");
    } 
      %>
  </body>
</html>
