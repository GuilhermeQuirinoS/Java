/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appsistemapolitico;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Quirino
 */
public class AppSistemaPolitico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Politico> politicos = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome do politico: ");
        String nome = input.nextLine();
        System.out.println("Funcao do politico: ");
        String funcao = input.nextLine();
        System.out.println("Estado do politico: ");
        String estado = input.nextLine();
        System.out.println("Partido do politico: ");
        String partido = input.nextLine();
        System.out.println("Municipio do politico: ");
        String municipio = input.nextLine();
        
        Prefeito p1 = new Prefeito(municipio,nome,partido,estado,funcao);
        
        politicos.add(p1);
        
        p1.apresentacao();
        p1.apresentacaoP();
    }
    
}
