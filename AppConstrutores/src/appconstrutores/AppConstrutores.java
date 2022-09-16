/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appconstrutores;

/**
 *
 * @author osjunior
 */
public class AppConstrutores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usando o construtor padrão
        Funcionario f1 = new Funcionario();

        // Usando o construtor parametrizado
        Funcionario f2 = new Funcionario("João",
                "Pereira",
                1212.0,
                45,
                "Masculino",
                42);

        // Objeto da classe Carro
        Carro c1 = new Carro();
        Carro c2 = new Carro("Fusca", 2000, 6000.0);
        Carro c3 = new Carro("Gol", "Prata", 2015, 40000.0, 30000.0f);

    }

}
