/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex1;

/**
 *
 * @author Guilherme Quirino
 */
public class Matematica {
    public static int max3(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        return max;
    }
    public static boolean impar(boolean a, boolean b, boolean c){
        if (a == true && b == true && c == true)
            return true;
        if (a == true && b == false && c == false)
            return true;
        if (a == false && b == true && c == false)
            return true;
        if (a == false && b == false && c == true)
            return true;
        else
            return false;
        
    }
    public static boolean maioria(boolean a, boolean b, boolean c){
        return (a == b or b == c or c == a? true : false);
    }
}
