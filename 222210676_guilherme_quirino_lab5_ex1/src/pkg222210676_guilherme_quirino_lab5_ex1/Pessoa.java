/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab5_ex1;
/**
 *Super class contendo nome cpf e nascimento
 * @author Guilherme Quirino
 */
public class Pessoa {
    protected String nome;
    protected long cpf;
    protected Data nascimento;
    /**
     * 
     * @param nome
     * @param cpf
     * @param nascimento 
     */
    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
    /**
     * 
     * @return Nome 
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @return CPF
     */
    public long getCpf() {
        return cpf;
    }
    /**
     * 
     * @return Nascimento
     */
    public Data getNascimento() {
        return nascimento;
    }
    
    
    /**
     * 
     * @return printa os atributos da da super class
     */
    @Override
    public String toString() {
        return "\n"+this.getNome()+"\n"+this.getCpf()+ "\n"+ getNascimento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
