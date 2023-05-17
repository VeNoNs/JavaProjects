/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio16 {

    /**
     * @Escribir un programa en Java que haga uso de un switch mejorado y
     * utilice además agrupamiento de opciones. La variable a evaluar debe ser
     * de tipo char.​
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        char clase;
        String resultado;

        System.out.println("Ingres una letra: ");
        clase = entrada.next().charAt(0);

        resultado = switch (clase) {
            case 'a', 'e', 'i', 'o', 'u' ->
                "Es una vocal";
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' ->
                "Es una consonante";
            default ->
                "Otro Caracter";

        };
        
        System.out.println(resultado);
                
    }

}
