
package domain;



public class Padre {
    
    //Atributos
    protected String nombre;
    protected double sueldo;

    public Padre(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", sueldo: "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Padre{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
}
