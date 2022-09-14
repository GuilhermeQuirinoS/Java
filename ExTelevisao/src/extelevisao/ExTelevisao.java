/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extelevisao;

import java.util.Scanner;

/**
 *
 * @author Quirino
 */
public class ExTelevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o modelo da TV1:");
        tv1.setModelo(input.next());
        System.out.println("Digite o preco da TV1:");
        tv1.setPreco(input.nextFloat());
        System.out.println("Digite o tamanho da TV1:");
        tv1.setTamanho(input.nextFloat());
        System.out.println("Digite o volume da TV1:");
        tv1.setVolume(input.nextInt());
        System.out.println("Digite o canal da TV1:");
        tv1.setCanal(input.nextInt());
        
        System.out.println("Digite o modelo da TV2:");
        tv2.setModelo(input.next());
        System.out.println("Digite o preco da TV2:");
        tv2.setPreco(input.nextFloat());
        System.out.println("Digite o tamanho da TV2:");
        tv2.setTamanho(input.nextFloat());
        System.out.println("Digite o volume da TV2:");
        tv2.setVolume(input.nextInt());
        System.out.println("Digite o canal da TV2:");
        tv2.setCanal(input.nextInt());

        while (true) {
            System.out.println("--- Menu TV1 ---");
            System.out.println("Mudar o Volume");
            tv1.setVolume(input.nextInt());
            tv1.alteraVolume();
            System.out.println("Mudar de Canal");
            tv1.setAltCanal(input.nextInt());
            tv1.alteraCanal();
            
            System.out.println("--- Menu TV2 ---");
            System.out.println("Mudar o Volume");
            tv2.setVolume(input.nextInt());
            tv2.alteraVolume();
            System.out.println("Mudar de Canal");
            tv2.setAltCanal(input.nextInt());
            tv2.alteraCanal();
            
            break;
        }
    }
}
