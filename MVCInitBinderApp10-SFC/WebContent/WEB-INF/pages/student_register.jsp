<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <H1><CENTER> Stduent Registration Page </CENTER></H1>
 
 <form:form method="POST"  commandName="stCmd">
   <form:errors path="*"/> <br>
   name :<form:input path="sname"/> <br>
   DOB :<form:input path="dob"/> (dd-MM-yyyy)<br>
   DOJ :<form:input path="doj"/> (dd-MM-yyyy)<br>
   DOM :<form:input path="dom"/> (dd-MM-yyyy)<br>
  <input type="submit" value="register"/>   
 </form:form>