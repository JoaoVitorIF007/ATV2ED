/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv59;

import java.util.Scanner;

/**
 *
 * @author JoaoVitor
 */
public class Atv59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float a, b, c;
        System.out.println("Entrar com o 1° cateto: ");
        b = ler.nextInt();
        System.out.println("Entrar com o 2° cateto: ");
        c = ler.nextInt();

 

        a = (float) Math.hypot(b, c); 
        
        System.out.println("A hipotenusa é: "+ a);
        System.out.println("");
        
        
                
    }
    
}
