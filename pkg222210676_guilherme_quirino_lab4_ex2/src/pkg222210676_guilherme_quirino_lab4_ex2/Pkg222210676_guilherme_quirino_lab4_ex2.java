/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Guilherme Quirino
 */
public class Pkg222210676_guilherme_quirino_lab4_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pessoa> agenda = new ArrayList<>();
                
        Scanner input = new Scanner(System.in);
        String menu; 
        
        System.out.println("--- Menu ---");
        System.out.println("Digite n para criar uma nova pessoa");
        System.out.println("Digite d para deletar uma pessoa");
        System.out.println("Digite p para imprimir toda a agenda");
        System.out.println("Digite q para sair do programa");
        
        menu = input.next();
        switch (menu) {
            case "n":
                for(int i = 0; i < agenda.size(); i++)
                    agenda.add(new Pessoa(input.next(), input.nextInt()));
                    for(int i = 0; i < agenda.size(); i++){
                        System.out.println(agenda.get(i).getID()+"Novo Contato: \n"+ agenda.get(i).getNome()+"\n"+ agenda.get(i).getTelefone()+"\n"+ Pessoa.getID());
                    }
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
