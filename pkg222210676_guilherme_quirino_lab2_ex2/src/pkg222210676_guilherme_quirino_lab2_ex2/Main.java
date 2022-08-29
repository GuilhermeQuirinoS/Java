/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab2_ex2;
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
        Funcionario F1 = new Funcionario();
        Funcionario F2 = new Funcionario();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Funcionario 1:");
        System.out.println("Nome:");
        F1.setNome(input.next());
        System.out.println("Sobrenome:");
        F1.setSobrenome(input.next());
        System.out.println("Salario:");
        F1.setSalario(input.nextInt());
        F1.anual();
        
        
        System.out.println("\nFuncionario 2:");
        System.out.println("Nome:");
        F2.setNome(input.next());
        System.out.println("Sobrenome:");
        F2.setSobrenome(input.next());
        System.out.println("Salario:");
        F2.setSalario(input.nextInt());
        F2.anual();
        
        
        
    }
    
}
