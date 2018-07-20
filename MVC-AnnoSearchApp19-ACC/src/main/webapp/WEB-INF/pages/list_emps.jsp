<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <h1><center> Employee Details</center></h1>
 <c:choose>
    <c:when test="${searchResults ne null }">
      <table border="1">
           <tr>
             <th>No</th>
             <th>Name</th>
             <th>Job</th>
             <th>Salary</th>
             <th>Dept no</th>
             <th>Manager no</th>
            </tr>
            <c:forEach var="emp" items="${searchResults}">
              <tr>
                 <td><c:out value="${emp.no }"/></td>
                 <td><c:out value="${emp.name }"/></td>
                 <td><c:out value="${emp.job }"/></td>
                 <td><c:out value="${emp.salary}"/></td>
                 <td><c:out value="${emp.deptNo}"/></td>
                 <td><c:out value="${emp.mgrNo}"/></td>
              </tr>
            </c:forEach>
      </table>
    </c:when>
    <c:otherwise>
       <h1><center>Records not found </center></h1>
    </c:otherwise>
 </c:choose> 
 <br>
   <a href='search.htm'>home</a>