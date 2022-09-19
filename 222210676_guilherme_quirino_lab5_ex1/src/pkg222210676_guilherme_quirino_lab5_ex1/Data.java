/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab5_ex1;

/**
 *  Funcionalidade de juntar dia mes e ano e formatar a data para saida na tela do usuario
 * @author Guilherme Quirino
 */
class Data {
    private int dia;
    private int mes;
    private int ano;
    /**
     * 
     * @param dia
     * @param mes
     * @param ano 
     */
    public Data(int dia,int mes,int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    /**
     * 
     * @return Dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @return Mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @return Ano
     */
    public int getAno() {
        return ano;
    }
    
    /**
     * 
     * @return printa a data de maneira formatada
     */
    @Override
    public String toString() {
        return this.getDia() +"/"+ this.getMes() +"/"+ this.getAno(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
