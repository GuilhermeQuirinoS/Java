/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0202;

import java.util.Scanner;

/**
 *
 * @author Guilherme Quirino
 */
public class Exercicio0202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwapperDemo troca = new SwapperDemo();
        
        System.out.println("Digite o valor de X e Y: ");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Valor de X = ");
        troca.setX(input.nextFloat());
        System.out.println("Valor de Y = ");
        troca.setY(input.nextFloat());
        
        troca.swap();
        
        System.out.println("New X ="+ troca.getX());
        System.out.println("New Y ="+ troca.getY());
        
        
    }
    
}
