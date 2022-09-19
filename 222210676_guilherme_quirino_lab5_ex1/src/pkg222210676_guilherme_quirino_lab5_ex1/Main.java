/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab5_ex1;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Quirino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        
        String nome = "roberto";
        double salario = 1600;
        long cpf = 4534222;
        Data ad = new Data(11,03,2002);
        Data nascimento = new Data(03,01,2001);
        
        Funcionario f = new Funcionario(ad, salario, nome, cpf, nascimento);
        funcionarios.add(f);
        for(Funcionario ff : funcionarios)
            System.out.println(ff);
        
        int departamento = 2;
        String nome2 = "Guilherme";
        double salario2 = 30000;
        long cpf2 = 1273604;
        Data ad2 = new Data(28,07,2018);
        Data promo = new Data(11,12,1990);
        
        Gerente g = new Gerente(departamento, promo, ad2, salario2, nome2, cpf2, nascimento);
        gerentes.add(g);
        for(Gerente gg : gerentes)
            System.out.println(gg);
    }
    
}
