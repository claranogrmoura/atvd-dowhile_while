/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javadowhileex;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class javadowhile3 {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
  
      System.out.println("Digite um numero:");
       int inteiro = scanner.nextInt(); 

    do{
System.out.println(inteiro);
   inteiro--;
            } while(inteiro>=1);
                    
    
    
            }
}