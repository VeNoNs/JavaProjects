/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.com.white.tarea;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Tarea {

    /**
     *Tarea de la semana 2
     * Imprime un boleto de viaje Interprovincial
     */
    
    public static void main(String[] args) {
        
        //1.Variables
        
        Scanner entrada = new Scanner(System.in);
        String nombre, dni, destino,fecha;
        int asiento;
        
        //2.Ingreso de Datos
        System.out.println("Bienvenido a la Empresa Cromotex: ");
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de documento: ");
        dni=entrada.nextLine();
        System.out.println("Ingrese el destino del viaje: ");
        destino=entrada.nextLine();
        System.out.println("Ingrese la fecha del viaje (dd/mm/aaaa): ");
        fecha=entrada.nextLine();
        System.out.println("Ingrese el numerod e asiento");
        asiento=entrada.nextInt();
        
        //3.Salida de Datos
        System.out.println("         BOLETO INTERPROVINCIAL         ");
        System.out.println("Nombre del pasajero: "+nombre);
        System.out.println("DNI del pasajero: "+dni);
        System.out.println("Destino: "+destino);
        System.out.println("Fecha del Viaje: "+fecha);
        System.out.println("Numero de Asiento: "+asiento);
        System.out.println("Gracias por elegir Cromotex");
    }
}
