/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab3_ex1;

/**
 *
 * @author Quirino
 */
public class Data {
    private int dia;
    private int mes;
    private String mesE;
    private int ano;
    private int totald;
    
    public Data(int a, int b){
       this.totald = a;
       this.ano = b;      
    }
    
    public Data(String a, int b, int c){
        this.mesE = a;
        this.dia = b;
        this.ano = c;
        
    }
    
    public Data(int a, int b, int c){
        this.mes = a;
        this.dia = b;
        this.ano = c;
    }
    
    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void exibeData1(){
        System.out.printf("%d/%d/%d\n", this.mes, this.dia, this.ano);
    }
    
    public void exibeData2(){
        System.out.printf("%s %d, %d\n", this.mesE, this.dia, this.ano);  
    }
    
    public void exibeData3(){
        System.out.printf("%d %d\n", this.totald, this.ano);
    }
}
