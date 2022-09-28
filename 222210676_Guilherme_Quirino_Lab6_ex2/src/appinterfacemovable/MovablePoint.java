/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appinterfacemovable;

/**
 * Responsavel pelos atributos do ponto e construtor do ponto
 * @author Guilherme Quirino
 */
public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    /**
     * 
     * @param x
     * @param y
     * @param xSpeed
     * @param ySpeed 
     */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    /**
     * move o ponto pra cima
     */
    public void moveUp(){
       y = y + ySpeed;
    }
    /**
     * move o ponto para baixo
     */
    public void moveDown(){
        y = y - ySpeed;
    }
    /*
    move o ponto para esquerda
    */
    public void moveLeft(){
        x = x - xSpeed;
    }
    /**
     * move o ponto para direita
     */
    public void moveRight(){
       x = x + xSpeed;
    }
    /**
     * 
     * @return retorna posicao do centro em X e Y
     */
    @Override
    public String toString() {
        return "Posicao em X: "+ x + "   Posicao em Y: "+ y;
    }
    
    
}
