/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.loja.models;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thays.souza
 */
public class ProdutoManager implements IProdutoManager{

    @Override
    public List<Produto> obterTodos() {
        List<Produto>produtos;
        produtos = new ArrayList<>();
        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("Geladeira");
        p1.setPreco(new Double(400.0f));
        
        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("fogao");
        p2.setPreco(new Double(300.0f));
        
        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("liquitificador");
        p3.setPreco(new Double(200.0f));
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        
     return produtos;
    }
    
    
}
