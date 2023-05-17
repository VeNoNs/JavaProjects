/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio15 {

    /**
     * @Escribir un programa en Java que muestre un menú de opciones y realice operaciones de acuerdo a condiciones dentro de una estructura switch. La variable a evaluar debe ser de tipo short.​
     */
    public static void main(String[] args) {
        //1.Variables
        short pedido;
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("-------------MENU-------------");
        System.out.println("1.Lomo Saltado");
        System.out.println("2.Soltero de Queso");
        System.out.println("3.Pollo Broster");
        System.out.println("4.Seco de Pollo");
        System.out.println("5.Aji de Gallina");
        System.out.println("6.Chaufa Peruano");
        System.out.println("Que desea pedir(1-6): ");
        pedido=entrada.nextShort();
        System.out.println("Ustede pidio el platillo numero: "+pedido);
        System.out.println("En un momento le traeremos su pedido.Gracias");
    }
    
}
