/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv62;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      double preco, npreco;
        System.out.println("Digite o valor do produto: ");
        preco = ler.nextInt();
        npreco = preco * 0.91;
        System.out.println("Preço com desconto: "+ npreco);
        
      
    }
    
}
