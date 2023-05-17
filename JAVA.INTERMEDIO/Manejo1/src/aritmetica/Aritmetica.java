
package aritmetica;

import excepcion.OperacionExcepcion;


public class Aritmetica {
    
    public static int division(int numerador, int denominador)/*throws OperacionExcepcion----ESTO SE USA CUANDO ES EXCEPCION*/{
        
        if( denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador/denominador;
    }
    
}
