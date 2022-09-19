/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsistemapolitico;

/**
 *
 * @author Guilherme Quirino
 */
public class Prefeito extends Politico{

    public Prefeito(String municipio, String nome, String partido, String estado, String funcao) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }
    
    
    private String municipio;

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }
    
    public void apresentacaoP(){
        System.out.println(super.nome+this.municipio);
    }
    
    
}
