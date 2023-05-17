
package test;

import domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        
        //Final en variables o atributos
        final int miVariable = 10;
        
        System.out.println("miVariable = " + miVariable);
        
        //No se puede modificar ni te lo permite 
        //Persona.MI_CONSTANTE = 5
        System.out.println(" "+Persona.MI_CONSTANTE);
        
        final Persona persona1= new Persona();
        //No se puede hacer lo siguiente 
        //persona1 = new Persona();
        //Si se puede modificar el contenido
        persona1.setNombre("Pedro");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("alberto");
        System.out.println("persona1 = " + persona1.getNombre());
    }
    
}
