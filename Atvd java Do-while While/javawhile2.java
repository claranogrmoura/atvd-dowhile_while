/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javawhile2;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class javawhile2 {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner (System.in);
        
   
       System.out.print("Digite um numero: ");
       int contador=1;
        int nu= scanner.nextInt();
        
        while(contador<=10){
            int resultado= nu*contador;
            System.out.println( nu+"X"+contador+"="+resultado+".");
            contador++;
        }
        
        scanner.close(); 
        
        
        
        
        
        
    } 
        
}