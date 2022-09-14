/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0404;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Quirino
 */
public class Exercicio0404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Peca> jogo = new ArrayList<>();
        
        jogo.add(new Peca("branca", "peao", "A", 2));
        jogo.add(new Peca("branca", "peao", "B", 2));
        jogo.add(new Peca("branca", "peao", "C", 2));
        jogo.add(new Peca("branca", "peao", "D", 2));
        jogo.add(new Peca("branca", "peao", "E", 2));
        jogo.add(new Peca("branca", "peao", "F", 2));
        jogo.add(new Peca("branca", "peao", "G", 2));
        jogo.add(new Peca("branca", "peao", "H", 2));
        jogo.add(new Peca("preto", "peao", "A", 7));
        jogo.add(new Peca("preto", "peao", "B", 7));
        jogo.add(new Peca("preto", "peao", "C", 7));
        jogo.add(new Peca("preto", "peao", "D", 7));
        jogo.add(new Peca("preto", "peao", "E", 7));
        jogo.add(new Peca("preto", "peao", "F", 7));
        jogo.add(new Peca("preto", "peao", "G", 7));
        jogo.add(new Peca("preto", "peao", "H", 7));
        
        jogo.add(new Peca("branca", "torre", "A", 1));
        jogo.add(new Peca("branca", "torre", "H", 1));
        jogo.add(new Peca("preto", "torre", "A", 8));
        jogo.add(new Peca("preto", "torre", "H", 8));
        
        jogo.add(new Peca("branca", "cavalo", "B", 1));
        jogo.add(new Peca("branca", "cavalo", "G", 1));
        jogo.add(new Peca("preto", "cavalo", "B", 8));
        jogo.add(new Peca("preto", "cavalo", "G", 8));
        
        jogo.add(new Peca("branca", "bispo", "C", 1));
        jogo.add(new Peca("branca", "bispo", "F", 1));
        jogo.add(new Peca("preto", "bispo", "C", 8));
        jogo.add(new Peca("preto", "bispo", "F", 8));
        
        jogo.add(new Peca("branca", "rei", "D", 1));
        jogo.add(new Peca("branca", "rainha", "E", 1));
        jogo.add(new Peca("preto", "rei", "D", 8));
        jogo.add(new Peca("preto", "rainha", "E", 8));
        

        for (int i = 0; i < jogo.size(); i++) {
            System.out.println("Cor: " + jogo.get(i).getCor());
            System.out.println("Tipo: " + jogo.get(i).getTipo());
            System.out.println("Posicao: "+ jogo.get(i).getColuna() + jogo.get(i).getLinha());
            System.out.println("");
        }
        
        System.out.println("para remover uma peca, insira a posicao: ");
        Scanner input = new Scanner(System.in);
        String CLN; 
        CLN = input.next();
        int L; 
        L = input.nextInt();
        
        for(int i = 0; i < jogo.size(); i++){
            if(jogo.get(i).getColuna().equals(CLN) && L == jogo.get(i).getLinha()){
                jogo.remove(jogo.get(i));
                System.out.println("Removido com Sucesso");
                for(Peca pp : jogo){
                    System.out.println("Cor: " + pp.getCor());
                    System.out.println("Tipo: " + pp.getTipo());
                    System.out.println("Posicao: "+ pp.getColuna() + pp.getLinha());
                    System.out.println("");
                }
            }            
        }
        System.out.println("Tamanho da lista: \n"+ jogo.size());
        
    }

}
