/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apphierarquiaprodutos;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Quirino
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Produto> produtos = new ArrayList<>();
        
        
        int precoL = 20;
        String autorL = "Roberto miro";
        String generoL = "Acao";
        String nomeL = "Harry Potter";
        String tipoL = "Legivel";
        
        Livro l = new Livro(precoL, autorL, generoL, nomeL, tipoL);
        produtos.add(l);
        
        for(Produto pp : produtos){
            System.out.println(pp);
        }
    }
    
}
