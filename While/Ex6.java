/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0; 
        int maior1 = Integer.MIN_VALUE; 
        int maior2 = Integer.MIN_VALUE; 

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º numero: ");
            int numero = scanner.nextInt(); 

            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero; 
            } else if (numero > maior2) {
                maior2 = numero;
            }
            contador++; 
        }
        System.out.println("Os dois maiores numeros digitados foram: " + maior1 + " e " + maior2);
        scanner.close(); 
    }
}