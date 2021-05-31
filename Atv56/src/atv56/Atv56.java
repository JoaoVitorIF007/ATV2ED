/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv56;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("");
        System.out.println("Nome = "+ nome);
        System.out.println("Idade = "+ idade);
        System.out.println("");
        
    }
    
}
