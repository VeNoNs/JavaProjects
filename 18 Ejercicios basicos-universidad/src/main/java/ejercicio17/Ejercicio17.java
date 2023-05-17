/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio17 {

    /**
     * @Escribir un programa en Java que utilice un switch (clásico o mejorado)
     * que trabaje con valores de tipo int. Utilizar constantes en lugar de
     * valores directos o “en duro” dentro del switch.​
     */
    public static void main(String[] args) {
        // 1.Variables
        Scanner entrada = new Scanner(System.in);
        int opcion;
        final int chocolate = 1;
        final int vainilla = 2;
        final int fresa = 3;
        final int mango = 4;
        final int chocochis = 5;
        System.out.println("Seleccione una sabor de helado: ");
        System.out.println("1.Chocolate");
        System.out.println("2.Vainilla");
        System.out.println("3.Fresa");
        System.out.println("4.Mango");
        System.out.println("5.Chocochis");

        opcion = entrada.nextInt();

        switch (opcion) {
            case chocolate:
                System.out.println("Ha seleccionado el sabor chocolate");
                break;
            case vainilla:
                System.out.println("Ha seleccionado el sabor vainilla");
                break;
            case fresa:
                System.out.println("Ha seleccionado el sabor fresa");
                break;
            case mango:
                System.out.println("Ha seleccionado el sabor mango");
                break;
            case chocochis:
                System.out.println("Ha seleccionado el sabor chocochis");
                break;
            default:
        }
    }

}
