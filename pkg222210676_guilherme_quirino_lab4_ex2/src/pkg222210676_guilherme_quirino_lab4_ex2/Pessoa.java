/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex2;
import java.util.Random;
/**
 *
 * @author Guilherme Quirino
 */
public class Pessoa {
    private String nome;
    private int telefone;
    private int ID;

    public Pessoa(String nome, int telefone) {
        Random random = new Random();
        int numero = random.nextInt(100);
        this.ID = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public int getTelefone() {
        return telefone;
    }
    
    
    
}
