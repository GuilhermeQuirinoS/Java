/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio0404;

/**
 * Classe para definicao das pecas do jogo de xadrez
 * @parameter cor tipo coluna linha
 * @author Guilherme Quirino
 */
public class Peca {
    private String cor;
    private String tipo;
    private String coluna;
    private int linha;

    public Peca(String cor, String tipo, String coluna, int linha) {
        this.cor = cor;
        this.tipo = tipo;
        this.coluna = coluna;
        this.linha = linha;
    }
    
    public String getColuna() {
        return coluna;
    }

    public String getCor() {
        return cor;
    }

    public int getLinha() {
        return linha;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
