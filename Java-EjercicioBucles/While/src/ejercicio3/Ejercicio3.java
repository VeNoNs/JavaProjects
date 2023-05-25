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
     * @Escribe un programa en Java que simule un juego de adivinanza. El
     * programa debe generar un número aleatorio entre 1 y 100, y luego permitir
     * al usuario ingresar números para intentar adivinarlo. Utiliza un bucle
     * while para contar la cantidad de intentos realizados y mostrar mensajes
     * indicando si el número ingresado es mayor, menor o igual al número
     * generado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroIngresado, intentos=0;
        int numeroAleatorio = (int) (Math.random() * 10);
        Scanner entrada = new Scanner(System.in);
        
        while (!(intentos == 5)) {
            System.out.println("Ingrese un numero: ");
            numeroIngresado = entrada.nextInt();
            intentos++;
            if(numeroIngresado==numeroAleatorio){
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡Usted gano!!!!!!!!!!");
                break;
            }else{
                System.out.println("Siga intentado");
            }
        }
        if(intentos==5){
           System.out.println("Usted perdio!!!!!!!!!!"); 
        }
        
        System.out.println("El numero Aleatorio es:  " + numeroAleatorio);
    }

}
