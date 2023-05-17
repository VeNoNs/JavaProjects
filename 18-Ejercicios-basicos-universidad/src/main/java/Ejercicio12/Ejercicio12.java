/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio12 {

    /**
     * @Resolver un problema matemático que utilice una condicional doble
     * anidada en una condición doble.​
     */
    public static void main(String[] args) {
        //1.Variables
        double numero1;
        Scanner entrada = new Scanner(System.in);

        //2.Entrada de Datos
        System.out.println("Ingrese cualquier numero asi sea con decimales");
        numero1 = entrada.nextDouble();

        if (numero1 % 1 == 0) {
            System.out.println("El numero es entreo");
            if (numero1 > 0) {
                System.out.print("y es positivo.");
            } else {
                System.out.print("y es negativo.");
            }
        } else {
            System.out.println("El numero es decimal");
            if (numero1 > 0) {
                System.out.print("y es positivo.");
            } else {
                System.out.print("y es negativo.");
            }
        }

    }

}
