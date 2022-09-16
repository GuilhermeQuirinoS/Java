/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appconstrutores;

/**
 *
 * @author osjunior
 */
public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private float km;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getKm() {
        return this.km;
    }

    public Carro() {
        this.setCor("Preta");
        this.setKm(0.0f);
    }

    public Carro(String modelo, int ano, double preco) {
        this.setModelo(modelo);
        this.setAno(ano);
        this.setPreco(preco);
    }

    public Carro(String modelo, String cor, int ano, double preco, float km){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
        this.setPreco(preco);
        this.setKm(km);
    }

}
