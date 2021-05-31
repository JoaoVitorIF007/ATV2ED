/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv86;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class ATV86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num;
        System.out.println("Digite o numero: ");
        num = ler.nextFloat();
        if(num > 0){
            System.out.println("POSITIVO");
        }
        else if (num < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NULO");
            
        }
    }
    
}
