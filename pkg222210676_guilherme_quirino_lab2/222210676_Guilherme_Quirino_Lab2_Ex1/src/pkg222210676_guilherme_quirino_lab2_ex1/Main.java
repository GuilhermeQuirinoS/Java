/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab2_ex1;
import java.util.Scanner;


/**
 *
 * @author Guilherme Quirino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o lado 1 do retangulo 1:");
        ret1.setLado1(input.nextInt());
        System.out.println("Digite o lado 2 do retangulo 1:");
        ret1.setLado2(input.nextInt());
        
        System.out.println("Digite o lado 1 do retangulo 2:");
        ret2.setLado1(input.nextInt());
        System.out.println("Digite o lado 2 do retangulo 2:");
        ret2.setLado2(input.nextInt());
        
        
        System.out.println("Retangulo2: Lado1 ="+ ret2.getLado1()+"Lado2 ="+ ret2.getLado2());
        
        System.out.println("Retangulo1:");
        System.out.println("Lado1 ="+ ret1.getLado1());
        System.out.println("Lado2 ="+ ret1.getLado2());
        ret1.area();
        ret1.perimetro();
        
        System.out.println("Retangulo2:");
        System.out.println("Lado1 ="+ ret1.getLado1());
        System.out.println("Lado2 ="+ ret1.getLado2());
        ret2.area();
        ret2.perimetro();
    }  
    
}
