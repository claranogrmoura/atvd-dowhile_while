/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvdowl4;

import java.util.Scanner;

/**
 *
 * @author claranogrmoura
 */
public class javadowhile4 {

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner scanner= new Scanner(System.in);
        int inteiro= scanner.nextInt();
       
        int impar=0;
       
        do{
            
               
            if(inteiro% 2== 1){
                
             impar++; 
            }
              System.out.println("Digite um numero novamente(ou 0 para sair): ");
             inteiro= scanner.nextInt();
            
        }
        while(inteiro != 0);
         System.out.println("Numeros impares:"+impar);// resultado
         
         
        
    }
}
