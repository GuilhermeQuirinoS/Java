/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex1;

/**
 * Classe matemática reune os construtores com numeros booleanos e inteiros como
 * parametro. Além disso também possui os métodos para operações maximo, numero
 * impares de entrada com valor true e maioria das entradas com valor true.
 * @author Guilherme Quirino
 */
public class Matematica {
    /**
     * contador para realizar as comparações com as entradas booleanas
     */
    public static int i = 0;
   

    /**
     *
     * @param num1
     * @param num2
     * @param num3
     * @return maior numero dentre os 3
     */
    public static int max3(int num1, int num2, int num3) {
        int max = 0;
        max = Math.max(num1,Math.max(num2, num3));
        return max;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return retorna verdadeiro se o numero de entradas true for impar e caso
     * contrário retorna false
     */
    public static boolean impar(boolean a, boolean b, boolean c) {
        if (a == true) {
            i++;
        }
        else if (b == true) {
            i++;
        }
        else if (c == true) {
            i++;
        }
        return (i == 3) || (i == 1);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return retorna verdadeiro se a maioria das entradas for true, caso
     * contrário retorna false
     */
    public static boolean maioria(boolean a, boolean b, boolean c) {
        return (i >= 2);

    }

}
