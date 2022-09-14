/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.data;

/**
 *
 * @author Guilherme Quirino
 */
public class Data {
    private int mes;
    private int dia;
    private int ano;
    
    public int getMes(){
        return this.mes;
    }
    public int getDia(){
        return this.dia;
    }
    public int getAno(){
        return this.ano;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void exibeData(){
        System.out.printf("%d/%d/%d \n",this.mes,this.dia,this.ano);
    }
}   
    
