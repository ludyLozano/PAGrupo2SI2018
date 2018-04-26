<%-- 
    Document   : consultaorden
    Created on : 25/04/2018, 06:38:19 PM
    Author     : ONivia
--%>

<%@page import="ean.northwind.comun.pojos.Customer"%>
<%@page import="ean.northwind.bll.procesos.CustomerBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    //Declaracion
    enum EstadosPagina {RESPUESTA,MENSAJE}
%>
<%
    //Scriptlet
    EstadosPagina estadopagina = null;
    String ordenid = null;
    String contactName = null;
    String customerId = null;
    
    if(request.getParameter("ordenid")!=null) {
        ordenid = request.getParameter("ordenid");
        
        CustomerBL customerbl = null;
        Customer cust = null;
        
        if(!ordenid.equals("")) {
            customerbl = new CustomerBL();
            cust = customerbl.obtenerCustomerByOrderId(Integer.parseInt(ordenid));

            if(cust != null) {
                contactName = cust.getContactName();
                customerId = cust.getCustomerID();
                estadopagina = EstadosPagina.RESPUESTA;            
            } else {
                estadopagina = EstadosPagina.MENSAJE;
            }
        }
    }
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Orden</title>
    </head>
    <body>
        <form name="form1" method="post" action="consultaorden.jsp" autocomplete="off">
            <h2>Entre La Orden: </h2>
            <input type="text" name="ordenid" value="">
            <input type="submit" value="Consultar">
        </form>
        <%if(estadopagina == EstadosPagina.RESPUESTA) {%>
            <p>
                <b>El ID Cliente es: </b><%=customerId%><br>
                <b>El Cliente es: </b><%=contactName%><br>
                <a href="actualizacliente.jsp">Actualizar Cliente</a>
            </p>
        <%} else if (estadopagina == EstadosPagina.MENSAJE) {%>
            <p>
                <b>La Orden <%=ordenid%> NO existe!</b>
            </p>
        <%}%>
    </body>
</html>
