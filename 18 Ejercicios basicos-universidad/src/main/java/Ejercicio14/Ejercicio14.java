/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio14 {

    /**
     * @El banco ABC quiere aumentar el límite de crédito de sus clientes según
     * el tipo de tarjetas que poseen (ver cuadro):​ Tipo de Tarjeta Aumento de
     * Límite de Crédito 1 25% de la línea de crédito 2 35% de la línea de
     * crédito 3 45% de la línea de crédito Otro 50% de la línea de crédito
     * Excepción:​ Si los clientes que tienen el tipo de tarjeta 1 o 2 tienen
     * una deuda con el banco, solo podrán conseguir la mitad del aumento
     * propuesto en el cuadro​. Escribir un programa que permita ingresar la
     * línea de crédito, el tipo de tarjeta y la deuda de un cliente (si la
     * tiene) y calcule la nueva línea de crédito propuesta por el banco​.
     */
    public static void main(String[] args) {
        //1.Variables
        int tipoTarjeta;
        String deuda;
        double lineaCredito, aumento;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su linea de Credito: ");
        lineaCredito = entrada.nextDouble();
        System.out.println("Tipo de Tarjeta: ");
        tipoTarjeta = entrada.nextInt();
        System.out.println("Tiene Deuda(SI/NO): ");
        deuda = entrada.next();

        if (tipoTarjeta >= 1) {
            switch (tipoTarjeta) {
                case 1:
                    if (deuda.equalsIgnoreCase("SI")) {
                        aumento = lineaCredito * 0.125;
                        lineaCredito = lineaCredito + aumento;
                    } else {
                        aumento = lineaCredito * 0.25;
                        lineaCredito = lineaCredito + aumento;
                    }
                    break;
                case 2:
                    if (deuda.equalsIgnoreCase("SI")) {
                        aumento = lineaCredito * 0.175;
                        lineaCredito = lineaCredito + aumento;
                    } else {
                        aumento = lineaCredito * 0.35;
                        lineaCredito = lineaCredito + aumento;
                    }
                    break;
                case 3:
                    aumento = lineaCredito * 0.45;
                    lineaCredito = lineaCredito + aumento;
                    break;
                default:
                    aumento = lineaCredito * 0.5;
                    lineaCredito = lineaCredito + aumento;

            }
        }
        
        System.out.println("Su nueva Linea de Credito es: "+lineaCredito);

    }

}
