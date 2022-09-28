/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appabstractanimal;

/**
 *
 * @author Guilherme Quirino
 */
public class Morcego extends Animal implements IFlyable, IWalkable{

    public Morcego(String nome) {
        super(nome);
    }
    
    public void voar(){
        System.out.println("Voar");
    }
        
    public void andar(){
        System.out.println("Anda");
    }
    
}
