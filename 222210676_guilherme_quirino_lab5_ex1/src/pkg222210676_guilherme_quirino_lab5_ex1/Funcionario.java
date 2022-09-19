/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab5_ex1;

/**
 * Contem caracteristicas do funcionario como admissao e salario
 * @author Guilherme Quirino
 */
public class Funcionario extends Pessoa{
    protected Data admissao;
    protected double salario;
    /**
     * 
     * @param admissao
     * @param salario
     * @param nome
     * @param cpf
     * @param nascimento 
     */
    public Funcionario(Data admissao, double salario, String nome, long cpf, Data nascimento) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    
    /**
     * 
     * @return Salario do funcionario
     */
    public double getSalario() {
        return salario;
    }
    /**
     * 
     * @return data de admissao
     */
    public Data getAdmissao() {
        return admissao;
    }
    
    /**
     * 
     * @return printa as caracteristicas do funcionario
     */
    @Override
    public String toString() {
        return super.toString()+"\n"+getAdmissao() +"\n" + getSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
    }
    
    
}
