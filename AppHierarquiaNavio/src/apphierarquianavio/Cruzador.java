/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquianavio;

import static java.lang.Math.sqrt;

/**
 *
 * @author Guilherme Quirino
 */
public class Cruzador extends NavioDeGuerra{
    private int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, String nome, int numTripulantes) {
        super(blindagem, ataque, nome, numTripulantes);
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }
    
    public void poderDeFogo(){
        double poder; 
        poder = super.ataque*(Math.sqrt(numCanhoes));
        System.out.println("Poder de Fogo: "+ poder);
    }
}
