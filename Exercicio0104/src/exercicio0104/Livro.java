/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio0104;
/**
 *
 * @author Guilherme Quirino
 */
public class Livro {
    private String nome;
    private String sobrenome;
    private String autor;

    public Livro(String nome, String sobrenome, String autor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    
}
