package test;

import domain.*;

public class TestConvercionObjetos {

    public static void main(String[] args) {
        Padre padre1;
        //padre1 esta apuntadno a su clase hija
        // lo que se ejecuta es el metodo de la clase hija y no el metodo de la clase
        //padre a pesar de que ambos tienen el mismo tipo de metodo 
        padre1 = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("padre1 = " + padre1);

        // No se puede llamar a los metodos propios de la clase hija debido
        //A que el atributo que se creo es de clase Padre
        //para acceder se hace por conversion de objetos
        //DOWCASTING
        ((Escritor) padre1).getTipoEscritura();//Esto es la convertcion de un tipo padre a un tipo hijo
     Escritor escritor =(Escritor)padre1;
      escritor.getTipoEscritura();
        //
//Esto es la convercion de un tipo hijo a un tipo padre
//UPCASTING
        Padre padre2 = escritor;
        System.out.println("padre2 = " + padre2.obtenerDetalles());
    }

}
