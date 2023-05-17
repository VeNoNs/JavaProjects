package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPérsonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo Persona
//       Persona personaNueva = new Persona("Carlos", "Torres", "torres@gmail.com", "34897589346");
//       personaDao.insertar(personaNueva);
        //MODIFICAR OBJETO DE TIPO PERSONA 
//       Persona personaModificar = new Persona(4,"Juan Carlos"," ToRRES", "Torrescas@gmail.com","236754");
//       personaDao.actualizar(personaModificar);
//     ELIMINAR UN REGISTRO 
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);

        //Esto sale del metodo SELECT Y SIRVE PARA MOSTRAR TODOS LOS REGISTROS
        //QUE HAY EN LA BASE DE DATOS
        List<Persona> personas = personaDao.seleccionar();
//        for (Persona persona:personas) {
//            System.out.println("persona = " + persona);
//        }
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }

}
