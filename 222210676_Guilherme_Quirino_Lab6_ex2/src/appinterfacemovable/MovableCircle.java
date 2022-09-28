/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appinterfacemovable;

/**
 * Contem os atributos do circulo e os metodos com prints do movimentos do centro
 * @author Guilherme Quirino
 */
public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    /**
     * 
     * @param radius
     * @param center 
     */
    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }
    /**
     * 
     * @return retorna os pontos do centro
     */
    public MovablePoint getCenter(){
        return this.center;
    }
    /**
     * move o centro para cima e printa
     */
    public void moveUp(){
        center.y += center.ySpeed;
        System.out.println("Nova posicao de y: "+ center.y);
    }
    /**
     * move o centro para baixo e printa
     */
    public void moveDown(){
        center.y -= center.ySpeed;
        System.out.println("Nova posicao de y: "+ center.y);
    }
    /**
     * move o centro para esquerda e printa
     */
    public void moveLeft(){
        center.x -= center.xSpeed;
        System.out.println("Nova posicao de x: "+ center.x);
    }
    /**
     * move o centro para direita e printa
     */
    public void moveRight(){
        center.x += center.xSpeed;
        System.out.println("Nova posicao  de x: "+ center.x);
    }
    /**
     * 
     * @return retorna o centro e o raio
     */
    @Override
    public String toString() {
        return "Posicao do centro:\n"+ center + "\n Tamanho do raio: "+ radius;
    
    }
}