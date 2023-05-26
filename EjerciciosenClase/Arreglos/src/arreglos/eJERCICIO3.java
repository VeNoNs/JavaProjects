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
public class eJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int longitud,min,max;
        System.out.println("Ingrese la longuitud: ");
        longitud= entrada.nextInt();
        int[] edades = new int[longitud];
        String[] nombres = new String[longitud];
        
        
        
        
        for(int i=0; i<edades.length;i++){
            System.out.println("Ingrese el nombre: ");
            nombres[i]=entrada.next();
            edades[i]= (int) (Math.random()*100);
        }
        int j=0;
        for(int edad: edades){
            System.out.println("Nombre: "+nombres[j]);
            System.out.println("Edad: "+edad);
            j++;
        }
        int indice=0;
        min=max=edades[0];
        for(int edad: edades){
            if(edad>max){
                max=edad;
                
            }
            if(edad<min){
                min=edad;
            }
        }
        
        System.out.println("EDAD MAYOR: "+max);
        System.out.println("EDAD MINIMO: "+min);
        
        
        
    }
    
}
