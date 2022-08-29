
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios0102;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Guilherme Quirino
 */
public class Exercicios0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestePessoa p1 = new TestePessoa();
        TestePessoa p2 = new TestePessoa();
        TestePessoa p3 = new TestePessoa();
        
        System.out.printf("Digite o nome, cpf e idade da pessoa 1,2 e 3:\n");
        
        Scanner input = new Scanner(System.in);
        p1.setNome(input.next());
        p1.setCpf(input.next());
        p1.setIdade(input.nextInt());
        
        p2.setNome(input.next());
        p2.setCpf(input.next());
        p2.setIdade(input.nextInt());
        
        p3.setNome(input.next());
        p3.setCpf(input.next());
        p3.setIdade(input.nextInt());
        
        System.out.println("Pessoa 1:\n");
       
        System.out.println("Nome: "+ p1.getNome());
        System.out.println("Cpf: "+ p1.getCpf());
        System.out.println("Idade: "+ p1.getIdade()+"\n");
        
        System.out.println("Nome: "+ p2.getNome());
        System.out.println("Cpf: "+ p2.getCpf());
        System.out.println("Idade: "+ p2.getIdade()+"\n");
        
        System.out.println("Nome: "+ p3.getNome());
        System.out.println("Cpf: "+ p3.getCpf()); 
        System.out.println("Idade: "+ p3.getIdade()); 
    }

}
