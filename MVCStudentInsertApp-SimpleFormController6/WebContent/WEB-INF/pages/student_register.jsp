<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1><center> Student Registration</center></h1>

<form:form  method="POST"  commandName="stCmd">
  Student Number: <form:input path="sno"/> <br>
  Student Name: <form:input path="sname"/> <br>
  Student Address: <form:input path="sadd"/> <br>
  <input type="submit"  value="Register"/>
</form:form> 