/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.habbibs;

/**
 *
 * @author LAB_ETECIA
 */
public class Produto {
    
    public String nome;
    // String (S maiusculo por que é uma classe)
    public double preco;
    // Double  é um tipo de dado primitivo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    // Botao direito "Inserir codigo" - "Getter e Setter" - Selecionar o que deseja criar
    
}
