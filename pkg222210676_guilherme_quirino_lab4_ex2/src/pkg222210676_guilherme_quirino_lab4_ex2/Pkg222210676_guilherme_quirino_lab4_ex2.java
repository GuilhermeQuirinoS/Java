/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Contém a estrutura funcional do menu que irá interagir com o array agenda e
 * os atributos dos objetos que serão criados dentro da classe pessoa de acordo
 * com as funcionalidade de cada opção possivel
 * @author Guilherme Quirino
 */
public class Pkg222210676_guilherme_quirino_lab4_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pessoa> agenda = new ArrayList<>();//uma agenda tipo array que contera os atributos das pessoas
        
        /**
         * Cria um looping para o menu
         */
        do {
            System.out.println("             --- Menu ---");
            System.out.println("Digite -> n <- para criar uma nova pessoa");
            System.out.println("Digite -> d <- para deletar uma pessoa");
            System.out.println("Digite -> p <- para imprimir toda a agenda");
            System.out.println("Digite -> q <- para sair do programa");
   
            Scanner input = new Scanner(System.in);
            char menu = input.next().charAt(0);
            /**
            * @param menu sera um dos inputs solicitados ao usuário de acordo com o menu
            *
            */
            switch (menu) {
                /**
                 * Cria um contato na agenda
                 */
                case 'n' -> {
                    System.out.println("Digite o nome do contato: ");
                    String nome = input.next();
                    System.out.println("Digite o telefone do contato: ");
                    int telefone = input.nextInt();

                    Pessoa p1 = new Pessoa(nome, telefone);
                    agenda.add(p1);

                    continue;
                }
                /**
                 * Remove um contato da agenda
                 */
                case 'd' -> {
                    System.out.println("Digite o nome do contato a ser removido");
                    String remover = input.next();
                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i).getNome().equals(remover)) {
                            agenda.remove(agenda.get(i));
                            System.out.println("Removido com sucesso");
                        }
                    }
                    System.out.println("Contato removido com sucesso");
                    System.out.println(agenda.size());

                    continue;
                }
                /**
                 * imprime todos os contatos da agenda
                 */
                case 'p' -> {
                    for (int i = 0; i < agenda.size(); i++) {
                        System.out.println("Nome: " + agenda.get(i).getNome());
                        System.out.println("Telefone: " + agenda.get(i).getTelefone());
                        System.out.println("ID: " + agenda.get(i).geraID()+("\n"));
                    }
                    continue;
                }
                /**
                 * sai do programa
                 */
                case 'q' -> {
                    System.out.println("Programa parado com sucesso");
                    return;
                }
                default -> {
                    continue;
                }
            }
        } while (true);
    }
}
