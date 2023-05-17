
package test;

//import domain.Hija; Esto solo usa la clase hija
import domain.*;//Esto usa todas las clases del paquete domain


public class Test {
    
    public static void main(String[] args) {
       
        //Es to es de sobreescritura de metodos
        Hija hija = new Hija("Jorge", 4000, "RRHH");
        System.out.println("hija = " + hija.obtenerDetalles());
        
        
        //ESTO ES POLIMORFISMO
        
        Padre padre1 = new Padre ("Frank", 3000);
        //System.out.println("padre1 = " + padre1.obtenerDetalles());
        imprimir(padre1);
        
        
        padre1 = new Hija("Camila", 2000, "Administracion");
        //Hija hija2 = new Hija("CAMILA", 3000, "CONTABILIDAD");
        //System.out.println("hija2 = " + hija2.obtenerDetalles());
        imprimir(padre1);
    }
    
    //POLIMORFISMO
    
    public static void imprimir(Padre padre) {
        System.out.println("padre = " + padre.obtenerDetalles());
        
    }
    
}
