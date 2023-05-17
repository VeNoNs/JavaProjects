package test;

import domain.Persona;

public class TestJavaBeans {
   
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setApellido("Ortiz");
        persona.setNombre("Diana");
        
        System.out.println("persona = " + persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
    }
    
}
