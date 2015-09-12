/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.loja.controllers;

import br.pucpr.prog4.loja.models.ClienteManager;
import br.pucpr.prog4.loja.models.ClienteManagerIMPL;
import br.pucpr.prog4.loja.models.Pessoa;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thays
 */
@WebServlet(name = "ClienteServelet", urlPatterns = {"/cliente/cadastro"})
public class ClienteServelet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/cadastroCliente.jsp");
        rd.forward(request, response);
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(request.getParameter("pessoa"));
        pessoa.setNomeChamado(request.getParameter("nomeChamado"));
        String cpfAux;
        cpfAux = request.getParameter("cpf");
        Long cpf;
        cpf = Long.parseLong(cpfAux);
        pessoa.setCpf(cpf);
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataNascimento = sdf.parse(request.getParameter("dataNascimento"));
            pessoa.setDataNasc(dataNascimento);
        } catch (Exception e) {
            Logger.getLogger(ClienteServelet.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        pessoa.setTipoPessoa("sexo");
        pessoa.setTipoPessoa("pessoa");
        
        ClienteManager manager;
        manager = new ClienteManagerIMPL();
        manager.cadastrar(pessoa);
        
        
        
       
        
        
       
    }


}
