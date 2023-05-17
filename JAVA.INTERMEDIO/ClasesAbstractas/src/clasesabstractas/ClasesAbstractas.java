
package clasesabstractas;

import domain.*;


public class ClasesAbstractas {

    
    public static void main(String[] args) {
        
        //No se puede crear objetos de la clase abstracta
       // FiguraGeometrica figura = new FiguraGeometrica();
       //Se puede crear objetos de la clase hija
       
       FiguraGeometrica figura = new Rectangulo("Rectangulo");
       figura.dibujar();
       
    }
    
}
