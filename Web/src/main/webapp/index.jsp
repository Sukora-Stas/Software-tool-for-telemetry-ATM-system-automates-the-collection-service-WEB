<%@ page import="by.belapb.dao.IAtmDao" %>
<%@ page import="by.belapb.pojos.ATM" %>
<%@ page import="by.belapb.dao.AtmDAOImpl" %>
<%@ page import="by.belapb.loader.MenuLoader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <jsp:forward page="jsp/login/login.jsp"/>
  <h1>FIRST</h1>

  <%--<table>--%>



    <%--<tbody>--%>
    <%--<tr>--%>
      <%--<th>Категория</th>--%>

      <%--&lt;%&ndash;<% for (ATM product : MenuLoader) {%>&ndash;%&gt;--%>
      <%--&lt;%&ndash;&lt;%&ndash;<td><a href="<%=product.getActionForServlet()%>"><%=product.getId()%></a></td>&ndash;%&gt;&ndash;%&gt;--%>
      <%--&lt;%&ndash;&ndash;%&gt;--%>
      <%--&lt;%&ndash;&ndash;%&gt;--%>
      <%--&lt;%&ndash;<%}%>&ndash;%&gt;--%>
      <%--<%ATM atm=MenuLoader.findATM(200);%>--%>
      <%--<b><%atm.getRegion();%></b>--%>
    <%--</tr>--%>


    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
      <%--&lt;%&ndash;<th>BIK</th>&ndash;%&gt;--%>
      <%--&lt;%&ndash;<% for (ATM atm : IAtmDao.INSTANCE_PRODUCT.getProducts()) {%>&ndash;%&gt;--%>


         <%--&lt;%&ndash;<b> <%=atm.getBIK()%></b>&ndash;%&gt;--%>

      <%--&lt;%&ndash;<%}%>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>


    <%--</tbody>--%>

  <%--</table>--%>



  </body>
</html>
