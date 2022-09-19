/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquianavio;

/**
 *
 * @author Guilherme Quirino
 */
public class PortaAvioes extends NavioDeGuerra{
    private int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, String nome, int numTripulantes) {
        super(blindagem, ataque, nome, numTripulantes);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    public void poderDeFogo(){
        double poder;
        poder = super.ataque * (numAvioes^2);
        System.out.println("Poder de fogo: "+ poder);
    }
}
