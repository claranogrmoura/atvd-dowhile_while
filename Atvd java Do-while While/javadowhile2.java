/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javadowhile2;

import java.util.Scanner;

/**
 *
 * @author claranogrmoura
 */
public class javadowhile2 {
    public static void main(String[] args) {
        System.out.println("Digite uma temperatura: ");
        Scanner scanner= new Scanner(System.in);
        int contador =0;
        int Celsius=scanner.nextInt();
        do{ 
           int fahrenheit=(Celsius*9/5)+32;
           System.out.println(Celsius+"°"+"Graus Celsius sao: "+fahrenheit+" em fahrenheit."); 
           
            System.out.println("Digite uma temperatura: ");
            
            Celsius=scanner.nextInt();
        }
        while(Celsius !=0);
        scanner.close();
    }
}
