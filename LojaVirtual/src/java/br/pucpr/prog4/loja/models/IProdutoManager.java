/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.loja.models;

import java.util.List;

/**
 *
 * @author thays.souza
 */
public interface IProdutoManager {
    List<Produto>obterTodos();
    Produto obterPorId(int id);
}
