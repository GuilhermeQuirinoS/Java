/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquiaprodutos;

/**
 *
 * @author Guilherme Quirino
 */
public class DVD extends Produto{
    private double preco;
    private double duracao;

    public DVD(double preco, double duracao, String nome, String tipo) {
        super(nome, tipo);
        this.preco = preco;
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
