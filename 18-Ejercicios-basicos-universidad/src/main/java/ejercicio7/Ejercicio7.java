/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio7 {

    /**
     * Escribir un programa en Java que haga uso de estructuras 
     * condicionales dobles para realizar 
     * lecturas de datos distintos, en cada caso.​
     */
    public static void main(String[] args) {
        //1.Variables
        String usuario="Donpepe";
        String contra="182467";
        String usuarioIngresado,contraIngresado;
        Scanner entrada= new Scanner(System.in);
        
        //2.Ingreso de Datos
        System.out.println("Usuario: ");
        usuarioIngresado=entrada.nextLine();
        System.out.println("Contraseña: ");
        contraIngresado=entrada.nextLine();
        
        if(usuarioIngresado.equals(usuario) && contraIngresado.equals(contra)){
            System.out.println("Acceso Concedido");
        }else{
            System.out.println("Acceso DENEGADO");
        }
    }
    
}
