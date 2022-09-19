/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquianavio;

/**
 *
 * @author Guilherme Quirino
 */
public class NavioDeGuerra extends Navio{
    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, String nome, int numTripulantes) {
        super(nome, numTripulantes);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }
    
    public void poderDeFogo(){
        System.out.println("Armas: "+ this.ataque);
    }
    
    public void exibirArmas(){
        exibirinfoGeral();
        System.out.println("Blindagem: "+ this.blindagem);
        poderDeFogo();
    }
}
