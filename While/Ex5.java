/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0; 
        int maiorNumero = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º numero: ");
            int numero = scanner.nextInt();
          
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
               contador++; 
        }
        System.out.println("O maior numero digitado foi: " + maiorNumero);
        scanner.close(); 
    }
}
