/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tentativawl;

import java.util.Scanner;

/**
 *
 * @author claranogrmoura

 */
public class javawhile1 {

 
    public static void main(String[] args) {
         
        
        int contadorposi = 0; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: "); 
        int numusuario = scanner.nextInt(); 

     
       if (numusuario <= 0) { 
           
            System.out.println("Este número é negativo ou nulo (0), fim da sequência");
            return; 
        }

        
        while (numusuario >= 1) { 
            
            contadorposi += numusuario;

            System.out.print("Digite um numero: "); 
            numusuario = scanner.nextInt();
        }

     
        System.out.println("Este número é negativo ou nulo (0), fim da sequência");
        System.out.println("A soma dos números positivos é: " + contadorposi);
      scanner.close();    
    }
}
