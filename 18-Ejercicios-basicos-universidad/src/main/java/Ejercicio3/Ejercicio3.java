/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.time.*;
import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio3 {

    /**
     * Implementar un programa que imprima un ticket de operación de un agente bancario.​
     */
    public static void main(String[] args) {
        //1.Ingreso de Variables
        String numeroCuenta, operacion;
        double monto;
        LocalDate fecha =LocalDate.now();
        LocalTime hora = LocalTime.now();
        Scanner entrada = new Scanner(System.in);
        
        //2.Ingreso de Datos
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta=entrada.nextLine();
        System.out.println("Tipo de Operacion (DEPOSITO/RETIRO)");
        operacion=entrada.nextLine();
        System.out.println("Monto de la Operacion: ");
        monto=entrada.nextDouble();
        
        //3.MUESTRA DE DATOS
        System.out.println("AGENTE BCP--- DONPEPE");
        System.out.println("Fecha: "+fecha);
        System.out.println("Hora: "+hora);
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Tipo de operacion: "+operacion);
        System.out.println("Monto: $/"+monto);
        
                
    }
    
}
