/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici10;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio10 {

    /**
     * Resolver un problema matemático que utilice una condicional simple
     * anidada en una condición doble.​
     */
    public static void main(String[] args) {
        //1.Variabbles
        double numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        //2.Lectura de Datos
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextDouble();

        //3.Operaciones
        if (numero1 > 0) {
            // Si el segundo número es par
            if (numero2 % 2 == 0) {
                System.out.println("La suma de los dos números es " + (numero1 + numero2));
            }
        } else {
            System.out.println("El primer número debe ser positivo");
        }

    }

}
