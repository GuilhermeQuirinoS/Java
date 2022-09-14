/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab3_ex1;

/**
 *
 * @author Quirino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data today = new Data(06,11,2002);
        Data today2 = new Data("Junho",11,2002);
        Data today3 = new Data(365,2002);
        
        today.exibeData1();
        today2.exibeData2();
        today3.exibeData3();
    }
    
}
