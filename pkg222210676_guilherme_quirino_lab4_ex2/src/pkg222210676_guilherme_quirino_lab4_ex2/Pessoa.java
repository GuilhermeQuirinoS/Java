/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab4_ex2;

import java.util.Random;

/**
 * Classe pessoa irá conter os atributos da nova pessoa que sera criada na
 * agenda,
 *
 * @author Guilherme Quirino
 * @version 1.0.0
 */
public class Pessoa {

    private String nome;
    private int telefone;
    private static int ID = 0;

    /**
     * Resposável pela contrução do objeto pessoa
     * @param nome
     * @param telefone
     */
    public Pessoa(String nome, int telefone) {
        this.ID = geraID();
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Define o telefone de acordo com o input do usuario
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Define o telefone de acordo com o input do usuario
     * @param telefone 
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Acessa o nome da pessoa
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }
    /**
     * Acessa o numero de telefone da pessoa
     * @return o telefone da pessoa
     */
    public int getTelefone() {
        return telefone;
    }
    /**
     * Acessa e cria um ID sequencial diferente para cada pessoa nova 
     * adicionada na agenda
     * @return o ID da pessoa 
     */
    public static int geraID() {
        return ID++;
    }
}
