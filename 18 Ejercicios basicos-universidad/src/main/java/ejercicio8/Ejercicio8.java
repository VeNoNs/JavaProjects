/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio8 {

    /**
     * @Escribir un programa en Java que haga uso de estructuras 
     * condicionales dobles para mostrar 
     * ciertos resultados en pantalla, en cada caso.​
     */
    public static void main(String[] args) {
        //1.Variables
        Scanner entrada= new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero: ");
        numero=entrada.nextInt();
        
        if(numero%2 ==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es Impar");
        }
            
    }
    
}
