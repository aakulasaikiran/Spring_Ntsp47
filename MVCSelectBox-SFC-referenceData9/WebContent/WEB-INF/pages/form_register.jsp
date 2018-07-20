<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form method="POST" commandName="regCmd">

  <form:errors path="*"/>
  <br>
  sno  : <form:input path="sno"/><br>
  Courses: <form:select path="course" >
                          <form:options items="${crsItems}"/>
                    </form:select>
  
  
  <input type="submit"  value="send"/>
</form:form>
