/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercici6 {

    /**
     * Solicita al usuario dos números enteros positivos 
     * y calcula su máximo común divisor utilizando una 
     * estructura do-while. Muestra el MCD en pantalla.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo del Maximo Comun Divisor (MCD)");
        System.out.print("Ingrese el primer numero entero positivo: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero entero positivo: ");
        int numero2 = entrada.nextInt();

        int mcd = 0;
        int resto;

        do {
            resto = numero1 % numero2;
            if (resto != 0) {
                numero1 = numero2;
                numero2 = resto;
            } else {
                mcd = numero2;
            }
        } while (resto != 0);

        System.out.println("El MCD de los números ingresados es: " + mcd);
    }
    
}
