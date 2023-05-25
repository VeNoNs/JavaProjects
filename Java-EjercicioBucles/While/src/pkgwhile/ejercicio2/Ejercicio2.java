/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio2 {

    /**
     * @Escribe un programa en Java que solicite al usuario ingresar un 
     * número entero positivo y utilice un bucle while para calcular el 
     * producto de todos los números impares desde el número ingresado 
     * hasta 1. Al finalizar, mostrar el producto resultante en pantalla
     */
    public static void main(String[] args) {
        // El acumulador lo puse como double por si colocan un numero mayor a 100
        int numero=0;
        double acumulador=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero=entrada.nextInt();
        
        while(numero>1){
            if(numero%2==0){
                
            }else{
                //la multiplicacion de todos los numero impares es 
                acumulador *=numero;
            }
            numero--;
        }
        System.out.println("La multiplicacion de todos los impares es: "+acumulador);
    }
    
}
