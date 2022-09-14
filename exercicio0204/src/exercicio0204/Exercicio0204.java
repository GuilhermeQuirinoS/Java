/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0204;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Guilherme Quirino
 */
public class Exercicio0204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> lista = new ArrayList<>();

        lista.add("BELGICA");
        lista.add("BRASIL");
        lista.add("USA");

        ArrayList<String> lista2 = (ArrayList<String>) lista.clone();

        System.out.println("lista clonada" + lista2);

    }

}
