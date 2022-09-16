/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex1;

/**
 *  Chama os metodos definidos na classe Matematica para realizarem suas 
 *  funções
 * @author Guilherme Quirino
 */
public class Pkg222210676_guilherme_quirino_lab4_ex1 {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Maior dos 3 numeros? ");
        int maior = 0;
        maior = Matematica.max3(65,100,16);
        System.out.println(maior);
        
        System.out.println("Numeros impares de entradas com valor true? ");
        boolean impar = Matematica.impar(false, false, true);
        System.out.println(impar);
        
        System.out.println("Maioria das entradas com valor true: ");
        boolean maioria = Matematica.maioria(true, true, false);
        System.out.println(maioria);
    }
    
}
