/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab2_ex2;

/**
 *
 * @author Guilherme Quirino
 */
public class Funcionario {

    private String nome;
    private String sobrenome;
    private double salario;

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if(salario >= 0)
            this.salario = salario;
        else
            this.salario = 0;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void anual(){
        double salario_anual = salario * 12;
        System.out.printf("Salario anaual: R$%.2f", salario_anual);
        double aumento = salario_anual * 0.10;
        double salario_aumentado = salario_anual + aumento;
        System.out.printf("\nSalario anaual com aumento: R$%.2f", salario_aumentado);
    }
    
}
