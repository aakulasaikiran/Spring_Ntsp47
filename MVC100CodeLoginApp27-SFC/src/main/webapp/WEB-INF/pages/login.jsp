<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<h1><center> Login Screen</center></h1>
<form:form method="POST" commandName="userCmd">
 Username : <form:input path="uname"/><br>
Password : <form:input path="pwd"/><br>
 <input type="submit" value="Login"/>
</form:form>
<br>
 ${result}



