<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
  <h1> Multiple submit buttons based Form page</h1>
<form action="perform.htm"  method="post">
   Number:  <input type="text" name="uid"><br>
   Name:  <input type="text" name="uname"><br>
   Email:  <input type="text" name="email"><br>
   <input type="submit"  name="opt"  value="insert">
   <input type="submit"  name="opt"  value="update">
   <input type="submit"  name="opt"  value="delete">
</form>
  <br>
<c:if test="${operation ne null }">
    ${operation} is successful
 </c:if>
 <br><br>
 <a href="perform.htm">list</a>