/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio5 {

    /**
     * Escribe un programa en Java que solicite al usuario ingresar
     * una serie de números enteros y utilice un bucle while para 
     * calcular la suma acumulativa de los números ingresados que 
     * sean múltiplos de 4. El bucle debe finalizar cuando 
     * se ingrese un número negativo. Al finalizar, mostrar la suma 
     * total.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0, numero;
        Scanner entrada = new Scanner(System.in);
        boolean negativo=false;
        System.out.println("Suma de numeros multiplos de 4 hasta qye ingrese un negativo");
        while(negativo== false){
            
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
            if(numero<0){
                negativo=true;
            }
            if(numero%4==0 && numero>0){
                suma+=numero;
            }
        }
        System.out.println("Suma: "+suma);
    }
    
}
