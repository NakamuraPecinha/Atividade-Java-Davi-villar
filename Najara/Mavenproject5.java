/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Mavenproject5 {

   public static void main(String[] args) {
       
       try (
               Scanner scanner = new Scanner(System.in)) {
           
           System.out.print("Digite seu nome: ");
           String nome = scanner.nextLine();
      
           System.out.print("Digite sua idade: ");
           int idade = scanner.nextInt();
         
           System.out.print("Digite sua altura (em metros): ");
           double altura = scanner.nextDouble();
          
           System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
      
       }
    }
}
