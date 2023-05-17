
package dominio;


public class Persona {
    
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminar;
    
    //Constructores
    
    public Persona(String nombre,double sueldo, boolean eliminar){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminar = eliminar;
    }
    
    //METODO GET o IS - recupera informacion
    //METODO SET - se puede modificar la informacion
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminar() {
        return this.eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }
    
    //to String se usa para imprimir todo los valores  que haya en la clase y los combierte en string 
    //Se manda a llamar automaticamente con el println 
    public String toString(){
        return "Persona [ nombre:"+this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminar+ "]";
    }
}
