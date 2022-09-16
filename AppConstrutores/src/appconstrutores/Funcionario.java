/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appconstrutores;

/**
 *
 * @author osjunior
 */
public class Funcionario {

    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private int idade;
    private String sexo;
    private int numero;
    
    /* Construtor é a porta de entrada da classe. */

    // Construtor padrão
    public Funcionario() {
        // Inicializar a conexão com BD
    }

    // Construtor parametrizado
    public Funcionario(String nome,
            String sobrenome,
            double salarioMensal,
            int idade,
            String sexo,
            int numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;
    }
}
