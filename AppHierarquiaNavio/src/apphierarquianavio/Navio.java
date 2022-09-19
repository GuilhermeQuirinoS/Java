/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquianavio;

/**
 *
 * @author Guilherme Quirino
 */
public class Navio {
    protected int numTripulantes;
    protected String nome;
    
    public Navio(String nome,int numTripulantes){
        this.nome = nome;
        this.numTripulantes = numTripulantes;
    }
    
    public void exibirinfoGeral(){
        System.out.println("\nNome: "+ this.nome +"\nNumero de tripulantes: "+ this.numTripulantes);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }
    
    
}
