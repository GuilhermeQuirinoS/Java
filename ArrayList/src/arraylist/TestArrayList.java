/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Guilherme Quirino
 */
public class TestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        ArrayList<Pessoa> p;
        p = new ArrayList<>();
        
        p.add(new Pessoa("Joao", 43));
        p.add(new Pessoa("guilkherme", 23));
        p.add(new Pessoa("roberto", 67));
        
        Iterator<Pessoa> itr = p.iterator();
        
        for (int i = 0; i < p.size(); i++){
            System.out.println("Nome " + p.get(i).getNome());
            System.out.println("Idade " + p.get(i).getIdade());
            System.out.println();
        }
        
        for(Pessoa pp : p){ //metodo each//
            System.out.println("Nome " + pp.getNome());
            System.out.println("Idade " + pp.getIdade());
            System.out.println();
        }
        
        while(itr.hasNext()){
            Pessoa pp = itr.next();
            System.out.println("Nome " + pp.getNome());
            System.out.println("Idade " + pp.getIdade());
            System.out.println();
        }
    }
    
}
