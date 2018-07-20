<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<h1><center> Emp Details</center></h1>
<c:choose>
  <c:when test="${result ne null }">
     <table border="1">
       <tr> <th> Empno</th><th>Emp name</th><th>Emp Salary</th><th>EmpDesg</th></tr>
       <c:forEach var="map" items="${result}">
          <tr>
            <td>${map.EMPNO }</td>
            <td>${map.ENAME }</td>
            <td>${map.SAL }</td>
            <td>${map.JOB }</td>
           </tr>
       </c:forEach> 
     </table>
  </c:when>
    <c:otherwise>
        <b> Records not found</b>
    </c:otherwise>  
</c:choose>
<br><br>
<a href="search.html">home</a>