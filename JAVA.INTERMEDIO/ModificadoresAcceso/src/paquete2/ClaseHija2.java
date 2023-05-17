
package paquete2;

import paquete1.Clase2;


public class ClaseHija2 extends Clase2{

    public ClaseHija2() {
        super();//Con esto podemos acceder al contrustor de la 
        //clase padre que esta con protected
        this.atributoProtected="Modificar atributo protegido";
        System.out.println("atributoProtegido = " + this.atributoProtected);
        this.metodoProtegido();
    }
    
    
    
}
