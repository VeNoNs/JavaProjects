package test;

import domain.Persona;

// Se ejecuta e l bloque estatico cada vez que se crea un
//objeto de la clase PERSONA
public class Test {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);

        System.out.println(" ");
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona2);
    }

}
