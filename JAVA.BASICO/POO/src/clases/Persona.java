
package clases;


public class Persona {
    
    // ATRIBUTOS: Caracteristica de nuestra clase 
    public String NOMBRE;
    public String apellido;
    public int edad;
    
    //METODO: Parte de codigo que se puede reutilizar 
    // se puede llamar tantas veces como se necesite 
    //puede recibir valores y regresar valores
    
    public void desplegarInformacion(){
        System.out.println("Nombre: "+NOMBRE);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
    }
    
}
