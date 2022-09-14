/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg222210676_guilherme_quirino_lab3_ex2;
import java.util.Scanner;
/**
 *
 * @author Quirino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Disciplina d1 = new Disciplina();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome da Disciplina:");
        d1.setNome(input.next());
        System.out.println("Codigo da Disciplina:");
        d1.setCodigo(input.next());
        
        System.out.println("Nome do Aluno:");
        d1.getAluno().setNome(input.next());
        System.out.println("RA do Aluno:");
        d1.getAluno().setRA(input.next());
        System.out.println("Curso do Aluno:");
        d1.getAluno().setCurso(input.next());
        
        System.out.println("Nome do Professor:");
        d1.getProfessor().setNome(input.next());
        System.out.println("Departamento do Professor:");
        d1.getProfessor().setDepartamento(input.next());
        
        System.out.println("Nome da Disciplina: "+ d1.getNome());
        System.out.println("Codigo da Disciplina: "+ d1.getCodigo());
        
        System.out.println("Nome do Aluno: "+ d1.getAluno().getNome());
        System.out.println("RA do Aluno: "+ d1.getAluno().getRA());
        System.out.println("Curso do Aluno: "+ d1.getAluno().getCurso());
        
        System.out.println("Nome do Professor: "+ d1.getProfessor().getNome());
        System.out.println("Departamento do Professor: "+ d1.getProfessor().getDepartamento());
    
    } 
}
