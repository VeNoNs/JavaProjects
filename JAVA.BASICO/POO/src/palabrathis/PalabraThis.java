
package palabrathis;

//Solo se puede poner una clase en publico las demas no 
//Las que no estan enn publico solo se usan dentro del mismo paquete
public class PalabraThis {
    public static void main(String[] args) {
        Persona p1 = new Persona("Frank", "Perez");
        System.out.println("p1 = " + p1.apellido);
        System.out.println("p1 = " + p1.nombre);
        System.out.println("p1 = " + p1);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada al constructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this. "+this);
        new Imprimir().imprimir(this);
    }
}
class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir "+persona);
        System.out.println("impresion del objeto actual(this)"+this);//apuntio a la clase constructoir imprimir vacio que se cre automaticamente
    }
}
