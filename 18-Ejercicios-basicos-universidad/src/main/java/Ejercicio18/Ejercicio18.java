/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio18 {

    /**
     * @ Escribir un programa en Java que muestre un menú y lea un tipo de
     * operación (suma, resta, multiplicación, división o potencia) y dos
     * números a operar. Mostrar el resultado de la operación realizada. Si se
     * ingresa un tipo de operación no válido, mostrar el mensaje “operación no
     * soportada”.​
     *
     * NOTA:
     *
     * - El programa simula el funcionamiento de una calculadora, permite hacer
     * las operaciones básicas con 2 valores ingresados por teclado.
     */
    public static void main(String[] args) {
        //1.Variables
        double resultado=0, numero1, numero2;
        int tipoOperacion;
        Scanner entrada = new Scanner(System.in);

        //2.Ingreso de Datos
        System.out.println("--------OPERACIONES--------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("Ingresa el numero de la operacion que quieres hacer:");
        tipoOperacion = entrada.nextInt();

        System.out.println("Ingresa el primer numero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada.nextDouble();

        switch (tipoOperacion) {
            case 1:
                resultado = numero1 + numero2;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            case 5:
                resultado = Math.pow(numero1, numero2);
                break;
                default:
                    System.out.println("Ingreso una operacion inexistente");

        }
        System.out.println("Resultado: "+resultado);
    }

}
