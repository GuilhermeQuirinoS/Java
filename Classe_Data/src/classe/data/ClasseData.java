/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe.data;

import java.util.Scanner;

/**
 *
 * @author Guilherme Quirino
 */
public class ClasseData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data dataTeste = new Data();
        
        System.out.println("Digite uma data: mes, dia e ano");
        Scanner input = new Scanner(System.in);
        
        dataTeste.setMes(input.nextInt());
        dataTeste.setDia(input.nextInt());
        dataTeste.setAno(input.nextInt());
        
        dataTeste.exibeData();
    }
    
}
