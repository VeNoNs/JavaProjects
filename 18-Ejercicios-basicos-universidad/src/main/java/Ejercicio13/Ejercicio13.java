/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio13 {

    /**
     * @Escribir un programa que lea un número entero entre 1 y 50 y lo escriba
     * en números romanos.
     */
    public static void main(String[] args) {
        // 1.Variables
        int numero, unidad, decena;
        String numeroRomano;
        //Use Arreglos porque el ejercicio iba a hacer muy largo en la parte de hallar
        String[] unidades = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"","X", "XX", "XXX", "XL", "L"};
        Scanner entrada = new Scanner(System.in);

        //2.Entrada de Datos
        System.out.println("Ingrese el numero entre (1-50)a convertir: ");
        numero = entrada.nextInt();

        //3.Hallar el numero 
        if (numero > 0 && numero <= 50) {
            unidad = numero % 10;
            decena = numero / 10;
            numeroRomano = decenas[decena] + unidades[unidad];
            System.out.println("Su convercion en romanos es: " + numeroRomano);
        } else {
            System.out.println("El numero no pertenece a la indicaciones dadas");
        }

    }

}
