/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio4 {

    /**
     * Solicita al usuario un número entero positivo 
     * y verifica si es un número primo utilizando 
     * una estructura do-while. Muestra un mensaje 
     * indicando si el número es primo o no.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        boolean primo= true;
        Scanner entrada = new Scanner(System.in);
        int divisor = 2;
        System.out.println("Ingrese un numero entero positivo: ");
        numero=entrada.nextInt();
        do{
            if(numero%divisor==0){
                primo=false;
                break;
            }
            divisor++;
        }while(divisor<=numero/2);
        
        if(primo){
            System.out.println("Es un numero Primo");
        }else{
            System.out.println("No es un numero primo");
        }
    }
    
}
