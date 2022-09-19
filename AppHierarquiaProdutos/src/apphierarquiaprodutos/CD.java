/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquiaprodutos;

/**
 *
 * @author Guilherme Quirino
 */
public class CD extends Produto{
    private double preco;
    private int faixas;
    private String nomeF;

    public CD(double preco, int faixas, String nomeF, String nome, String tipo) {
        super(nome, tipo);
        this.preco = preco;
        this.faixas = faixas;
        this.nomeF = nomeF;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public double getPreco() {
        return preco;
    }

    public int getFaixas() {
        return faixas;
    }

    public String getNomeF() {
        return nomeF;
    }
    
    
}
