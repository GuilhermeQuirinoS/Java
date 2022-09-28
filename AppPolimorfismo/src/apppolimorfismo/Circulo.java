/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppolimorfismo;

/**
 *
 * @author Guilherme Quirino
 */
public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    
    
    public double area(){
        return (Math.PI)*(raio*raio);
    }
    
    public double perimetro(){
        return 2*(Math.PI)*raio;
    }
    
    public void print(){
        System.out.println("Area: "+ area()+"\nPerimetro: "+ perimetro());
    }
}
