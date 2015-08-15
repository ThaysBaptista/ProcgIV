<%-- 
    Document   : produtos-lista
    Created on : 14/08/2015, 21:05:47
    Author     : thays.souza
--%>

<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.loja.models.Produto"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                List<Produto>produtos;
                produtos =(List<Produto>)request.getAttribute("produtos");
                for(Produto produto : produtos){
            %>
            <div>
                <p><%=produto.getNome() %></p>
                <img src ="/imagens/0<%=produto.getId() %>.jpg" 
                alt = "produto <%=produto.getId() %>">
                <p>R$ <%=produto.getId() %></p> 

            </div>

<%
            }
                
                %>
        </div>
    </body>
</html>
