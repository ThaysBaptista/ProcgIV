<%-- 
    Document   : cadastroCliente
    Created on : 28/08/2015, 19:54:56
    Author     : thays
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meu Cadastro</title>
        
    </head>
    <body>
        <h1>Meu Cadastro</h1>
        <form action="cadastro" method="POST">
            <label for="fisica">Fisica:</label>
            <input type="radio" name="pessoa" value="Fisica">
            <label for="juritica">Juritica</label>
            <input type="radio" name="pessoa" value="Juritica">
            <br>
            <label for="chamado">Como gistaria de ser chamado:
            <br>
            <input type="text" name="nomeChamado" id="chamado"></label>
            <br>
            <label for="nomeCompleto">nome completo:
            <br>
            <input type="text" name="nomeCompleto" id="nomeCompleto"></label>
            <br>
            <label for="cpf">CPF:</label>
            <br>
            <input type="text" name="cpf" id="cpf">
            <br>
            <label for="dataNasc">data de Nascimento:
            <br>
            <input type="text" name="dataNasc" id="dataNasc"></label>
            <br>
            <label for="sexo">Sexo:<br>
            <select name="sexo">
                <option value="selecionar">Selecionar</option>
                <option value="feminino">Feminino</option>
                <option value="masculino">Masculino</option>
            </select></label>
            <br><br>
            
            <textarea>
                
            </textarea>
             
             <br><br>
             <input type="submit" value="Enviar">
        </form>
    </body>
</html>
