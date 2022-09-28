/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appinterfacemovable;

/**
 *
 * @author Guilherme Quirino
 */
public class AppInterfaceMovable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovablePoint center = new MovablePoint(7,8,1,2);
        MovableCircle c = new MovableCircle(4, center);
        
        System.out.println(c);
        c.moveUp();
        c.moveDown();
        c.moveLeft();
        c.moveRight();
    }
    
}
