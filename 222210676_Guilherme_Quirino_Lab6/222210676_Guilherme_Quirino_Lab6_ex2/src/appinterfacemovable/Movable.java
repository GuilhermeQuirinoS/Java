/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appinterfacemovable;

/**
 * Interface resposavel por padronizar a utilização dos metodos moveUP, moveDown, moveLeft e moveRight
 * @author Guilherme Quirino
 */
public interface Movable {
    /**
     * anda para cima
     */
    public void moveUp();
    /**
     * anda para  baixo
     */
    public void moveDown();
    /**
     * anda para esquerda
     */
    public void moveLeft();
    /**
     * anda para direita
     */
    public void moveRight();
}
