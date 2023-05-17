/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio11 {

    /**
     * @Resolver un problema matemático que utilice una condicional doble anidada en una condición simple.​
     */
    public static void main(String[] args) {
        //1.Variables
        int numero1;
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("Ingrese un numero diferente de 0");
        numero1=entrada.nextInt();
        if(!(numero1==0)){
            if(numero1<0){
                System.out.println("Es un numero NEGATIVO");
            }else{
                System.out.println("Es un numero POSITIVO");
            }
        }
    }
    
}
