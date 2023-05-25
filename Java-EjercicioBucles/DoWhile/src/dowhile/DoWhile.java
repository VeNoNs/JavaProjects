/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class DoWhile {

    /**
     * Crear un programa en Java para convertir un número de base decimal a binario.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int decimal, residuo;
        String binario= "";
        System.out.println("CONVERCION A BASE BINARIO");
        System.out.println("Ingrese el numero: ");
        decimal=entrada.nextInt();
        do{
            residuo=decimal%2;
            binario=residuo+binario;
            decimal/=2;
        }while((decimal>0));
        System.out.print(" "+binario);
    }
    
}
