/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici9;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio9 {

    /**
     * @Resolver un problema matemático que utilice una 
     * condicional simple anidada en una condición simple.​
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int notafinal,nota1,nota2,nota3;
        Scanner entrada=new Scanner(System.in);
        
        //2.Lectura de Datos 
        System.out.println("Ingrese su nota1: ");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese su nota2: ");
        nota2 = entrada.nextInt();
        System.out.println("Ingrese su nota3: ");
        nota3 = entrada.nextInt();
        
        //3.Operaciones
        notafinal=(nota1+nota2+nota3)/3;
        if(notafinal>=12){
            System.out.println("Aprobaste");
            if(notafinal>=15){
                System.out.println("Felicidades fuiste mejor que el estudiante promedio");
            }
        }
    }
    
}
