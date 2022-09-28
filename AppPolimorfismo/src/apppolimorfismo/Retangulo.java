/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppolimorfismo;

/**
 *
 * @author Guilherme Quirino
 */
public class Retangulo extends Forma{
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public double perimetro(){
        return (comprimento + largura)*2;
    }
    
    public void print(){
        System.out.println("Perimetro: "+ perimetro());
    }
}
