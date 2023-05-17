
package test;

//import domain.Hija; Esto solo usa la clase hija
import domain.*;//Esto usa todas las clases del paquete domain


public class Test {
    
    public static void main(String[] args) {
       
        Padre padre1 = new Padre ("Frank", 3000);
        determinarTipo(padre1);
        padre1 = new Hija("Camila", 2000, "Administracion");
        determinarTipo(padre1);
    }
    
   
    
    public static void determinarTipo(Padre padre) {
        
        if(padre instanceof Hija){
            System.out.println("Es de tipo HIJA ");
            padre.obtenerDetalles();
    }
        else if(padre instanceof Padre){
            System.out.println("Es de tipo PADRE");
        }
        else if(padre instanceof Object){
            System.out.println("Es de tipo OBJETO");
        }
    }
    
}
