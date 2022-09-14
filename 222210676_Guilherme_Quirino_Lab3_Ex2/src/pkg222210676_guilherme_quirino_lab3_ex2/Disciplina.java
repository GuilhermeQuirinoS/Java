/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab3_ex2;

/**
 *
 * @author Quirino
 */
public class Disciplina {
    private String codigo;
    private String nome;
    private Aluno aluno;
    private Professor professor;
    
    // Optei por utilizar o método da composição devido a relação das classes de estarem associados à um objeto maior (Disciplina).//
    // Além disso pela lógica uma disciplina é composta por alunos e professor, o que torna essa associação conceitual mais óbvia)//
    public Disciplina() {
        this.aluno = new Aluno();
        this.professor = new Professor();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
