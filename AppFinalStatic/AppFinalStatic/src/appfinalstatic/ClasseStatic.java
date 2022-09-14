/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appfinalstatic;

/**
 *
 * @author osjunior
 */
public class ClasseStatic {

    public static int Z = 100;
    
    public static final int F = 9;

    public static int soma(int a, int b) {
        return a + b;
    }

    public void incrementa() {
        //Z = Z + 1;
        ClasseStatic.Z = ClasseStatic.Z + 1;
        // F = 10; // NÃO FUNCIONA
    }
}
