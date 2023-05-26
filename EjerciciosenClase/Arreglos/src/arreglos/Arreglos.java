/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 0, sumaNotas = 0;
        float promedio = 0.00f;
        Scanner entrada = new Scanner(System.in);
        String [] nombres = {"HUgo","Carlos","Albert"};
        System.out.println("Ingrese la cantidad de terminos: ");
        N = entrada.nextInt();

        int[] notas = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un numero");
            notas[i] = entrada.nextInt();
            sumaNotas = sumaNotas + notas[i];
        }
        for (int idx = 0; idx < N; idx++) {
            System.out.println(nombres[idx%3]+"->");
            System.out.println(notas[idx]);
        }

        promedio = (float) sumaNotas / (float) N;
        System.out.println("Promedio: " + promedio);
    }

}
