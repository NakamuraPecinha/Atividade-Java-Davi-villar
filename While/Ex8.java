/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int lado = scanner.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("O tamanho do lado deve estar entre 1 e 20.");
        } else {
            
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    // 
                    if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                        System.out.print("*"); 
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); 
            }
        }

       scanner.close(); 
    }
}
