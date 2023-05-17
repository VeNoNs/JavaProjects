
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;



public class TestHenrencia {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Frank", 5000);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente(new Date(), true, "Juanito Perez", 25, 'M', "Urb.los manzanitos");
        System.out.println("cliente1 = " + cliente1);
    }
    
}
