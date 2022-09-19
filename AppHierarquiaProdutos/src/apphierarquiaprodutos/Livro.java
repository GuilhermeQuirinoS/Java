/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquiaprodutos;

/**
 *
 * @author Guilherme Quirino
 */
public class Livro extends Produto{
    private double preco;
    private String autor;
    private String genero;

    public Livro(double preco, String autor, String genero, String nome, String tipo) {
        super(nome, tipo);
        this.preco = preco;
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n"+this.getAutor() + "\n"+this.getGenero() + "\n"+this.getNome() + "\n"+this.getTipo() + "\n"+this.getPreco(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    
    
    
}
