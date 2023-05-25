/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio4 {

    /**
     * Escribe un programa en Java que solicite al usuario ingresar un 
     * número entero positivo y utilice un bucle while para calcular 
     * el producto de los dígitos de dicho número en orden inverso. Por
     * ejemplo, si se ingresa el número 1234, el programa debe calcular 
     * el producto 4 * 3 * 2 * 1. Al finalizar, mostrar el producto resultante en pantalla.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo: ");
        int numero = entrada.nextInt();

        int producto = 1;
        int digito;

        while (numero > 0) {
            //Primero se saca el modulo entre 10 para obtener el ultimo numero y de ahi hasta obtener el primero
            digito = numero % 10;
            producto *= digito;
            numero /= 10;
            System.out.println("digito = " + digito);
            
        }

        System.out.println("El producto de los digitos en orden inverso es: " + producto);
    }
    
}
