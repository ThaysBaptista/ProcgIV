/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.loja.controllers;

import br.pucpr.prog4.loja.models.IProdutoManager;
import br.pucpr.prog4.loja.models.Produto;
import br.pucpr.prog4.loja.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thays.souza
 */
public class ProdutosListaServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            IProdutoManager manager;
            List<Produto>produtos;
            manager = new ProdutoManager();
            produtos = manager.obterTodos();
            
            request.setAttribute("produtos", produtos);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/WEB-INF/jsp/produtos-lista.jsp");
            rd.forward(request, response);
            
    }



}
