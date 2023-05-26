/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio5 {

    /**
     
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del reporte: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
