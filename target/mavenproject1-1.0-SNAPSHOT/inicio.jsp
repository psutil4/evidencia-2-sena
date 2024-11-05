<%-- 
    Document   : inicio
    Created on : 5/11/2024, 1:14:31 p. m.
    Author     : Soporte1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pagina de mi proyecto</title>
    </head>
    <body>
        <%
           if(session.getAttribute("nomusu")==null){
           response.sendRedirect("index.html");
           return
           }  
            %>
            <<h1>Bienvenido a mi aplicativo</h1>
            <table>
                <thead>
                    <tr>
                        <th scope="col">Planet</th>
                        <th scope="col">Diameter (km)</th>
                        <th scope="col">Distance to Sun (AU)</th>
                        <th scope="col">Orbit (days)</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">Mercury</th>
                        <td>4,880</td>
                        <td>0.39</td>
                        <td>88</td>
                    </tr>
                    <tr>
                        <th scope="row">Venus</th>
                        <td>12,104</td>
                        <td>0.72</td>
                        <td>225</td>
                    </tr>
                    <tr>
                        <th scope="row">Earth</th>
                        <td>12,742</td>
                        <td>1.00</td>
                        <td>365</td>
                    </tr>
                    <tr>
                        <th scope="row">Mars</th>
                        <td>6,779</td>
                        <td>1.52</td>
                        <td>687</td>
                    </tr>
  </tbody>
  <tfoot>
    <tr>
      <th scope="row">Average</th>
      <td>9,126</td>
      <td>0.91</td>
      <td>341</td>
    </tr>
  </tfoot>
</table>
    </body>
</html>
