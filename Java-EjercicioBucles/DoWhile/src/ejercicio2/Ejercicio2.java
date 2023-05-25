/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio2 {

    /**
     * @Escribir un programa que solicite un número “n” 
     * y muestre en pantalla los valores 1 y 0 dispuestos 
     * como se muestra en el ejemplo si n=5
     * 1
     * 01
     * 101
     * 0101
     * 10101
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        int filas=1;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresar un numero: ");
        n=entrada.nextInt();
        
        do {
            int columnas=1;
            do {
                System.out.print(columnas % 2);
                columnas++;
            } while (columnas <= filas);
            
            System.out.println();
            filas++;
        } while (filas <= n);
        
    }
    
}
