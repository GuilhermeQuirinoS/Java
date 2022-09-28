/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppolimorfismo;
import java.util.Scanner;
/**
 *
 * @author Guilherme Quirino
 */
public class AppPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(5,8);
        
        c.print();
        r.print();
        
        
        
    }
    
}
