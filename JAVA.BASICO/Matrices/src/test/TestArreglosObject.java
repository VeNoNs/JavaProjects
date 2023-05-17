
package test;

import domain.Persona;


public class TestArreglosObject {
   
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];
        
        personas[0]= new Persona("Juan");
        personas[1]= new Persona("Diana");
        
        System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);
        
        for(int i=0; i<personas.length;i++){
            System.out.println("i = " + i+" - "+personas[i]);
        
    }
        
    }
    
}
