<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
  <h1><center>Student Details  <a href="list_students.htm"> refresh</a></center> </h1> 
   <c:choose>
    <c:when test="${lstStudents ne null }">
      <table border="1">
           <tr>
             <th>no</th>
             <th>name</th>
             <th>Address</th>
             <th>operation</th>
            </tr>
            <c:forEach var="st" items="${lstStudents}">
              <tr>
                 <td><c:out value="${st.sno }"/></td>
                 <td><c:out value="${st.sname }"/></td>
                 <td><c:out value="${st.sadd }"/></td>
                 <td>
                   <a href="edit.htm?no=<c:out value="${st.sno}"/>">edit</a>
                   <a href="delete.htm?no=<c:out value="${st.sno}"/>">delete</a>
                 </td>
              </tr>
            </c:forEach>
      </table>
    </c:when>
    <c:otherwise>
       <h1><center>Records not found </center></h1>
    </c:otherwise>
 </c:choose>
    <center><br><br> <a href="insert.htm">Register new Student</a> </center> 
 <br><br><br>
   <c:if test="${result ne null}">
      <p style="color:red"><c:out value="${result}"/> </p>
   </c:if>
   <a href='home.htm'>home</a>