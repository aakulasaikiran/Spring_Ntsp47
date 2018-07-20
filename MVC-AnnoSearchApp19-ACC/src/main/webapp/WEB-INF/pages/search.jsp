<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <h1><center> Search Emp Details by giving known data</center></h1>
  
  <form action="searchEmps.htm" method="post">
     no : <input type="text" name="no"/> <br>
     name : <input type="text" name="name"/> <br>
     job : <input type="text" name="job"/> <br>
     salary : <input type="text" name="salary"/> <br>
      <input type="submit" value="search"/>
  </form>