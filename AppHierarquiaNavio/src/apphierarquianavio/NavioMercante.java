/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apphierarquianavio;

/**
 *
 * @author Guilherme Quirino
 */
public class NavioMercante extends Navio{
    private double capacidadeCarga;
    private double carga;

    public NavioMercante(double capacidadeCarga, double carga, String nome, int numTripulantes) {
        super(nome, numTripulantes);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }
    
    public void carregamento(){
        exibirinfoGeral();
        System.out.println("Volume carregado e capacidade de carga: "+ this.carga + this.capacidadeCarga);
    }
}
