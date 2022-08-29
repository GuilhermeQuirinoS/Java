/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0201;

import java.util.Scanner;

/**
 *
 * @author Guilherme Quirino
 */
public class Exercicio0201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int aux;

        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        number3 = input.nextInt();
        
        if(number1 > number2){
            aux = number1;
            number1 = number2;
            number2 = aux;
        }
        if(number1 > number3){
            aux = number1;
            number1 = number3;
            number3 = aux;
        }
        if(number2 > number3){
            aux = number2;
            number2 = number3;
            number3 = aux;
        } 
        System.out.printf("Ordem é: %d %d %d", number1, number2, number3);
        

        /*if (number1 >= number2) {
            if (number2 >= number3) {
                System.out.printf("In order %d %d %d ", number3, number2, number1);
            }

            if (number3 >= number1) {
                System.out.printf("In order %d %d %d ", number2, number1, number3);
            }

            if (number1 > number3) {
                System.out.printf("In order %d %d %d", number2, number3, number1);
            }
        }

        if (number2 > number1) {
            if (number3 >= number2) {
                System.out.printf("In order %d %d %d", number1, number2, number3);
            }
            if (number3 >= number1) {
                System.out.printf("In order %d %d %d", number2, number1, number3);
            }
            if (number3 > number1) {
                System.out.printf("In order %d %d %d", number1, number3, number2);
            }
        }*/

        /*double max = Math.max(number1, Math.max(number2, number3));
        double min = Math.min(number1, Math.min(number2, number3));
        double mid = number1 + number2 + number3 - max - min;
        
        System.out.printf("In order %f %f %f", min, mid, max);*/
    }
}
