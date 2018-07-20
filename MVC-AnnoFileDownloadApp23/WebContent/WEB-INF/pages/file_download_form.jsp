<%@page import="java.io.File" %>
<table border=1>
<tr><td>FileName</td><td>Download</td></tr>

<%       
          String path = "E:/springfileuploads"; 
         
          String file;
          File folder = new File(path);
          File[] listOfFiles = folder.listFiles(); 
         
          for (int i = 0; i < listOfFiles.length; i++)
          {
            if (listOfFiles[i].isFile()) 
           {
            	
           file = listOfFiles[i].getName();
%>
 <tr><td><%= file%></td>
 <td><a href="download.htm?file_name=<%= file%>">Download</a></td></tr>
 <% }
          }
          %>
  </table>        


</html>
 