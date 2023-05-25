/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio5 {

    /**
     * Solicita al usuario un número entero positivo y genera la secuencia de
     * Fibonacci hasta ese número utilizando una estructura do-while. Muestra la
     * secuencia en pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 0, numeroFinal, numero2 = 1,resultadoFibonaci=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("La secuencia de Fibonaci");
        System.out.println("Hasta que numero: ");
        numeroFinal = entrada.nextInt();
        System.out.println("SECUENCIA DE FIBONACI");
        System.out.print(numero1+","+numero2+",");
        do {
            resultadoFibonaci=numero2+numero1;
            System.out.print(resultadoFibonaci + ",");
            
            numero1 = numero2;
            numero2 =resultadoFibonaci;
        } while (resultadoFibonaci <= numeroFinal);
    }

}
