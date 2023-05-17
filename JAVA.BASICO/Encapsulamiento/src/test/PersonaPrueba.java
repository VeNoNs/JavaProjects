
package test;

import dominio.Persona; // si se quiere importar mas clases de todo el paquete se pone .*

public class PersonaPrueba {
   
    public static void main(String[] args) {
        Persona persona1 = new Persona("Frank", 5000, false);
        System.out.println("persona1 = " + persona1.getNombre());
        //Accediendo al metodo set se pudo cambia el nombre que ya se habia puesto
        persona1.setNombre("Diana");
        //Con el metodo get podemos recuperar la informacion 
//        System.out.println("persona1 = " + persona1.getNombre());
//        System.out.println("persona1 = " + persona1.getSueldo());
//        System.out.println("persona1 = " + persona1.isEliminar());
        System.out.println("persona1: "+persona1.toString());
        
        //EJERCICIO CREAR OTRO OBJETO Y MODIFICAR VALORES Y MANDARLOS A IMPRIMIR
        
        Persona persona2 = new Persona("Camila", 3000, true);
//        System.out.println("persona2 = " + persona2.getNombre());
//        System.out.println("persona2 = " + persona2.getSueldo());
//        System.out.println("persona2 = " + persona2.isEliminar());
        System.out.println("persona1: "+persona2);
        persona2.setEliminar(false);
        persona2.setNombre("Frank Daniel");
        persona2.setSueldo(8000);
        //CON EL METODO PRINTLN SE MANDA A LLAMAR AUTOMATICAMENTE AL METODO TOSTRING
        System.out.println("persona1: "+persona2);
//        System.out.println("persona2 = " + persona2.getNombre());
//        System.out.println("persona2 = " + persona2.getSueldo());
//        System.out.println("persona2 = " + persona2.isEliminar());
    }
    
}
