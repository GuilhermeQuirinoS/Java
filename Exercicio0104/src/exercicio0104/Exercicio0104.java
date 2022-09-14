/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0104;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Quirino
 */
public class Exercicio0104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Livro> lista = new ArrayList<>();
        ArrayList <Livro> lista2 = new ArrayList<>();
        
        lista.add(new Livro("MOISES", "a Chegada", "Eisten"));
        lista.add(new Livro("Harry Potter", "Ordem da Fenix", "EEJS"));
        
        lista2.add(new Livro("MOISES", "a Chegada", "Eisten"));
        lista2.add(new Livro("Harry Potter", "Ordem da Fenix", "EEJS"));
        
        System.out.println("Lista2:\n"+ lista2.getNome() + lista2.getSobrenome() + lista2.getAutor());
        
        if(lista.containsAll(lista2)){
            System.out.println("Lista2:\n"+ lista2.getNome() + lista2.getSobrenome() + lista2.getAutor());
        }
    }
    
}