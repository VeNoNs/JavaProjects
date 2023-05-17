package test;

import domain.Consultor;
import domain.Empleado;
import domain.Jefe;
import domain.Persona;

public class TestHerencia {

    public static void main(String[] args) {

//        Empleado empleado1 = new Empleado(1, "Jefe", 2000, 23, "23468", "Perez", "Karla", "Mi casa", "2398754");
//        System.out.println("this = " + empleado1);
//        
//        Empleado empleado2 = new Empleado();
//        empleado2.setCargo("Jefe");
//        System.out.println("empleado2 = " + empleado2);
//        
//        Consultor consultor = new Consultor();

          Persona vector[] = new Persona[5];
          vector[0] = new Persona();
          vector[1] = new Empleado();
          vector[2] = new Jefe();
          vector[3] = new Consultor();

    }
}
