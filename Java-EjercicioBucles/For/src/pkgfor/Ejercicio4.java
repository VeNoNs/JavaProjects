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
public class Ejercicio4 {

    /**
     * MOSTRAR EN PANTALLA LO SIGUIENTE 
       *
      ***
     *****
      ***
       *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Ingresar un Numero positivo: ");
            n = entrada.nextInt();
        } while (n <= 0);
        int mid=n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(j - mid) + Math.abs(i - mid) <= mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
