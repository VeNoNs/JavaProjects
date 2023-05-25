/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio3 {

    /**
     * Solicita al usuario un número entero positivo 
     * y calcula su factorial utilizando una estructura 
     * do-while. Muestra el resultado del factorial en pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,multiplicacion=1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar un numero ENTERO POSITIVO: ");
        numero=entrada.nextInt();
        do{
            multiplicacion*=numero;
            numero--;
        }while(numero>=1);
        
        System.out.println("El factorial es: "+multiplicacion);
    }
    
}
