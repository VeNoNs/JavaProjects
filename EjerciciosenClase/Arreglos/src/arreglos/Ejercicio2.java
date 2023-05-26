/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int longitud;

        System.out.println("Ingrese cantidad de terminos: ");
        longitud = entrada.nextInt();

        int[] valores = new int[longitud];
        //1.GENERA NUMEROS ALEATORIOS
        for (int indice = 0; indice < longitud; indice++) {
            valores[indice] = (int) (Math.random() * 100);
        }

        //MOSTRAR CONTENIDO
        int i = 0;
        while (i < longitud) {
            System.out.println("Numero: " + valores[i]);
            i++;
        }
        i=0;
        do{
           System.out.println("Numero: " + valores[i]);
            i++; 
        }while(i<longitud);

        //CALCULAR Y MOSTRAR LA SUMA
        int suma=0;
        int suma2=0;
        i=0;
        while(i<longitud){
            suma2+=valores[i];
            i++;
        }
        i=0;
        do {
            suma+=valores[i];
            i++;
        }while(i<longitud);
        System.out.println("Suma: "+suma);
        System.out.println("Suma2: "+suma2);
    }

}
