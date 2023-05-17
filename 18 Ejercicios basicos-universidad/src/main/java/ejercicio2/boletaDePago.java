/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class boletaDePago {

    /**
     * Ejercicico 2
     * Implementar un programa que imprima una boleta de pago, incluyendo descuentos, subtotal y total.​
     */
    public static void main(String[] args) {
        // 1.Variables
        double precio,descuento, subTotal,impuesto,total;
        Scanner entrada = new Scanner(System.in);
        
        //2.Ingreso de Datos
        System.out.println("Bienvenido a DonPepe");
        System.out.println("Ingrese el precio del Producto: ");
        precio=entrada.nextDouble();
        System.out.println("Ingrese el porcentaje del descuento (0-100)%");
        descuento=entrada.nextDouble();
        
        //3.Procedimiento
        
        total=precio-(precio*descuento/100);
        impuesto=total*0.18;
        subTotal=total-impuesto;
        
        System.out.println("BOLETA DE PAGO---Don Pepe");
        System.out.println("Precio del Producto: "+precio);
        System.out.println("Descuento: "+descuento);
        System.out.println("SubTotal: "+subTotal);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Total: "+total);
        System.out.println("Gracias por su compra en Don Pepe");
    }
    
}
