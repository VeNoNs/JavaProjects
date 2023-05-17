/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio6 {

    /**
     * @param Escribir un programa en Java que haga uso de 
     * estructuras condicionales dobles para realizar ciertas 
     * operaciones/procesos con datos, en cada caso.
     */
    public static void main(String[] args) {
        //1.Variables
        Scanner entrada= new Scanner(System.in);
        String palabra;
        System.out.println("Te gutas comer Helado (SI/NO)");
        palabra=entrada.next();
        
        if(palabra.equalsIgnoreCase("SI")){
            System.out.println("Te ganaste un descuento en helados");
        }else{
            System.out.println("Que mala suerte ");
        }
    }
    
}
