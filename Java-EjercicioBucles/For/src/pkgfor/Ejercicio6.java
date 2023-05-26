/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio6 {

    /**
     * Solicita al usuario ingresar un número entero positivo. 
     * Para imprimir en pantalla una serie numérica especial. 
     * Si el número es divisible por 3, muestra "Fizz"; 
     * si es divisible por 5, muestra "Buzz"; 
     * y si es divisible por ambos, muestra "FizzBuzz".
     * En los demás casos, muestra el número original.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println("Ingresar un Numero positivo: ");
            numero = entrada.nextInt();
        } while (numero <= 0);
        for(int i=1;i<numero;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz ,");
            }else if(i%5==0){
                System.out.print("Buzz ,");
            }else if(i%3==0){
                System.out.print("Fizz ,");
            }else{
                System.out.print(i+",");
            }
        }
    }
    
}
