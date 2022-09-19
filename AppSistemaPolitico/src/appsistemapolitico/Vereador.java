/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsistemapolitico;

/**
 *
 * @author Guilherme Quirino
 */
public class Vereador extends Politico{

    public Vereador(String municipio, String nome, String partido, String estado, String funcao) {
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
    
    public void apresentacaoV(){
        System.out.println(this.municipio);
    }
}
