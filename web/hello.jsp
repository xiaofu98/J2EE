<%@page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

你好 JSP

<br>

<%=new Date().toLocaleString()%>
<%for(int i =0;i<10;i++){%>
<h1><%= i %></h1>
<%}%>