/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appfinalstatic;

/**
 *
 * @author osjunior
 */
public class AppFinalStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseFinal c1 = new ClasseFinal();
        System.out.println(c1.x);

        ClasseFinal c2 = new ClasseFinal();
        System.out.println(c2.x);

        System.out.println(ClasseStatic.Z);
        ClasseStatic.Z = 0;        
        System.out.println(ClasseStatic.Z);
        
        ClasseStatic c3 = new ClasseStatic();
        c3.incrementa();
        System.out.println(ClasseStatic.Z);
        
        ClasseStatic c4 = new ClasseStatic();
        c4.incrementa();
        System.out.println(ClasseStatic.Z);
    }
}
