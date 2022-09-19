/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsistemapolitico;

/**
 *
 * @author Guilherme Quirino
 */
public class Politico {
    protected String nome;
    protected String partido;
    protected String estado;
    protected String funcao;

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }
    
    public void apresentacao(){
        System.out.println(this.nome+"\n"+this.estado+"\n"+this.funcao+"\n"+this.partido);
    }
}
