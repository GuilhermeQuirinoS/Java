/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab6_ex1;

/**
 * Contem os dois metodos com sobrecarga para calculo das areas possibilitando
 * diferentes entradas para o resultado.
 * @author Guilherme Quirino
 */
public class Area {
    /**
     * Printa a area
     * @param largura
     * @param comprimento 
     */
    public void aR(int largura, int comprimento){
        int area = comprimento * largura;
        System.out.println("Area: "+ area);
    }
    /**
     * Printa a area
     * @param lado 
     */
    public void aR(int lado){
        int area = lado * lado;
        System.out.println("Area: "+ area);
    }
}
