
package sobrecargametodos;

import operaciones.Operaciones;


public class SobrecargaMetodos {

    
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(23.99, 34);
        System.out.println("resultado = " + resultado);
        resultado = Operaciones.sumar(2, 6);
        System.out.println("resultado = " + resultado);
      
    }
    
}
