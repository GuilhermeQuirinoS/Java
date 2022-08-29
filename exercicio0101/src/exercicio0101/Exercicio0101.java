/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0101;
import java.util.Scanner;
/**
 *
 * @author Guilherme Quirino
 */
public class Exercicio0101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int number1;
        int number2;
        int number3;
        int produto;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt ();
        
        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt ();
        
        System.out.print("Digite o terceiro numero: ");
        number3 = input.nextInt ();
        
        produto = number1 * number2 * number3;
        
        System.out.printf("O produto é %d:", produto);
    }
}
