
package test;

import paquete1.Clase1;
import paquete2.ClaseHija2;


public class TestModificadores {
    
    public static void main(String[] args) {
        //Mandar a llamar el modificador de accseo PUBLICO
        //
        System.out.println("\nEsto es como llamar a clases PUBLICAS\n");
        Clase1 clase1 = new Clase1();//manda a llamar el constructor
        System.out.println("clase1 = " + clase1);//Manda a llamar la clase si hay to string imprime lo que hay adentro
        System.out.println("clase1 = " + clase1.atributoPublico);//Manda a llamar el atributo publico
        clase1.metodoPublico();//Manda a llamar metodo publico
        
        
        System.out.println("\nEsto es como llamar a clases protegidas desde una clase hija ya que no se puede llamar  directamente desde la clase padre\n");
        ClaseHija2 clasehija = new ClaseHija2();
        System.out.println(" "+clasehija);
    }

    
    
}
