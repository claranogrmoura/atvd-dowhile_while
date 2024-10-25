/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while4;

import java.util.Scanner;

/**
 *
 * @author claranogrmoura
 */
public class javawhile {

    public static void main(String[] args) {
         
        Scanner scanner= new Scanner(System.in);
        System.out.print("DIgite um numero:  ");
        int N= scanner.nextInt();
        int par=0;
        int impar=0;
        int inicio=1;
        
        while(inicio <=N){
            
            if(inicio % 2== 0){ 
                
            par++;   
                
            }
            else {
               impar++; 
               
               
             }
           inicio++; 
        }
        
         System.out.println("Numeros pares:"+par);
         System.out.println("Numeros impares:"+impar);
         scanner.close();
    }
}