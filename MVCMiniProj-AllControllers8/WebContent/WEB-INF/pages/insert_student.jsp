<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1><center> Insert Student Details </center></h1>

  <form:form method="POST" commandName="stCmd">
  <form:errors path="*"/> <br>
     Student no: <form:input   path="sno"/><br>
     Student name: <form:input   path="sname" /><br>
     Student Address: <form:input   path="sadd" /><br>
     <input type="submit" value="register"/>
  </form:form>

