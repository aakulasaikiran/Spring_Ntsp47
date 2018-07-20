<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center> Student Registration</center></h1>

<form:form  method="POST"  commandName="stCmd">
  <%-- <p style='color:red'> <form:errors path="*"/> </p> <br> --%>
  Student Number: <form:input path="sno"/><form:errors path="sno"/> <br>
  Student Name: <form:input path="sname"/><form:errors path="sname"/> <br>
  Student Address: <form:input path="sadd"/><form:errors path="sadd"/> <br>
  <input type="submit"  value="Register"/>
</form:form> 