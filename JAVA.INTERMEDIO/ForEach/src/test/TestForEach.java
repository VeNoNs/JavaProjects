
package test;

import domain.Persona;


public class TestForEach {
    
    //un FOREACH es un for mejorado
    public static void main(String[] args) {
        
        int edades[] = {4,5,7,9};
        //Definir una variable dependiendo del tipo de arreglo
        //En este caso el arreglo es int l a 
        //variable sera int definida entre parentesis
        // S e usa para recorrer el arreglo
        
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[]= {new Persona("Juan"), new Persona("Diana"),new Persona("Agustin")};
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
    }
}
