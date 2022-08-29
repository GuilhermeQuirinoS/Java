/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio0202;

/**
 *
 * @author Guilherme Quirino
 */
public class SwapperDemo {
    private float x;
    private float y;
    
    public float getX(){
        return this.x;
    }
    
    public float getY(){
        return this.y;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public void swap(){
        float aux = this.x;
        this.x = this.y;
        this.y = aux;
    }
}   
