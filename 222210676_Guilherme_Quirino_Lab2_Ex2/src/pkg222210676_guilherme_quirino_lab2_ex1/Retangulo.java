/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab2_ex1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guilherme Quirino
 */
public class Retangulo {
    private int lado1;
    private int lado2;

    public int getLado1() {
        return this.lado1;
    }
    public int getLado2() {
        return this.lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void area(){
        int A = lado1 * lado2;
        System.out.printf("Area = %d\n", A);
    }
    public void perimetro(){
        int P = lado1 + lado1 + lado2 + lado2;
        System.out.printf("Perimetro = %d\n", P);
    }
    
    
    
    
}
