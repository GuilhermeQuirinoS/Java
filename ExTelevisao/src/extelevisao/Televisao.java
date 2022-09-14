/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extelevisao;

import javax.print.attribute.SetOfIntegerSyntax;

/**
 *
 * @author Quirino
 */
public class Televisao {
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;
    private int altCanal;

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setAltCanal(int altCanal) {
        this.altCanal = altCanal;
    }
    
    public int getCanal() {
        return canal;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPreco() {
        return preco;
    }

    public float getTamanho() {
        return tamanho;
    }

    public int getVolume() {
        return volume;
    }
    
    public void alteraVolume() {
        int AltV = volume;
        System.out.printf("Volume atual: %d\n", AltV);
    }
    
    public void alteraCanal() {
        int AltC = canal + altCanal;
        System.out.printf("Canal atual: %d\n", AltC);
    }
    
}
