/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab5_ex1;

/**
 * Estrutura os atributos de um gerente como departamento e data de promocao
 * @author Guilherme Quirino
 */
public class Gerente extends Funcionario{
    private int departamento;
    private Data promocaoGerente;
    /**
     * 
     * @param departamento
     * @param promocaoGerente
     * @param admissao
     * @param salario
     * @param nome
     * @param cpf
     * @param nascimento 
     */
    public Gerente(int departamento, Data promocaoGerente, Data admissao, double salario, String nome, long cpf, Data nascimento) {
        super(admissao, salario, nome, cpf, nascimento);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }
    /**
     * 
     * @return departamento
     */
    public int getDepartamento() {
        return departamento;
    }
    /**
     * 
     * @return data de promocao do gerente
     */
    public Data getPromocaoGerente() {
        return promocaoGerente;
    }
    /**
     * 
     * @return printa todas as caracteristicas do gerente
     */
    @Override
    public String toString() {
        return super.toString()+"\n"+this.getPromocaoGerente()+"\n"+ this.getDepartamento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
