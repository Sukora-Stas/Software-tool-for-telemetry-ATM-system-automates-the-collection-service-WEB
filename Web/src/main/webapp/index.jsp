<%@ page import="by.belapb.dao.IAtmDao" %>
<%@ page import="by.belapb.pojos.ATM" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--<jsp:forward page="jsp/login.jsp"/>--%>
  <h1>FIRST</h1>

  <table>

    <h3>Категории</h3>


    <%--<tbody>--%>
    <%--<tr>--%>
      <%--<th>Категория</th>--%>
      <%--//INSTANCE_PRODUCT что это такое ?--%>
      <%--//В ProductDAO описана  такая переменная, отвечает за создание ProductDAOImpl--%>
      <%--//Ну у нас все будет по-другому, можете особо не запоминать это.--%>
      <%--//ProductDAO INSTANCE_PRODUCT= new ProductDAOImpl();--%>
      <%--<% for (ATM product : IAtmDao.INSTANCE_PRODUCT.getProducts()) {%>--%>
      <%--&lt;%&ndash;<td><a href="<%=product.getActionForServlet()%>"><%=product.getId()%></a></td>&ndash;%&gt;--%>
      <%----%>
      <%----%>
      <%--<%}%>--%>
    <%--</tr>--%>


    <%--<tr>--%>
      <%--<th>BIK</th>--%>
      <% for (ATM product : IAtmDao.INSTANCE_PRODUCT.getProducts()) {%>


         <b> <%=product.getBIK()%></b>

      <%}%>
    <%--</tr>--%>


    <%--</tbody>--%>

  </table>
  </body>
</html>
