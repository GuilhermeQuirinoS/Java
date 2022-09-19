/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apphierarquianavio;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Quirino
 */
public class AppHierarquiaNavio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Navio> navios = new ArrayList<>();
        
        int numAvioes = 27;
        double blindagem = 76.087;
        double ataque = 89;
        String nome = "AvioesDoCaralho";
        int numTripulantes = 2600;
        
        
        PortaAvioes pa = new PortaAvioes(numAvioes, blindagem, ataque, nome, numTripulantes);
        navios.add(pa);
        
        pa.exibirArmas();
        
        int numCanhoes = 65;
        double blindagemC = 58.098;
        double ataqueC = 88;
        String nomeC = "CanhoesDoCaralho";
        int numTripulantesC = 2600;
        
        Cruzador c = new Cruzador(numCanhoes, blindagemC, ataqueC, nomeC, numTripulantesC);
        navios.add(c);
        c.exibirArmas();
      
        
        
    }
    
}
