/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv134;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int idade;
        System.out.println("Entre com a idade: ");
        idade = ler.nextInt();
                
       if (idade < 5){
           System.out.println("Não existe categoria para essa idade");
       }
       else if (idade <= 7){
           System.out.println("Categoria Infantil A");
       }
       else if(idade <= 10){
           System.out.println("Categoria Infantil B");
       }
       else if(idade <= 13){
           System.out.println("Categoria Juvenil A");
       }
       else if (idade <= 17){
           System.out.println("Categoria Senior");
       }
    }
    
}
