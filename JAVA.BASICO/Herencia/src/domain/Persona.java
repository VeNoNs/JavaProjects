
package domain;


public class Persona {
    
    //Atributos
    //Protected se usa en la clase padre devido a que usaremos estos atributos en las clases hija
    //Si las calses hijas no tendran sub clases ya podemos usar private en caso contrario usar protected
    protected String nombre;
    protected int edad;
    protected char genero;
    protected String direccion;
    
    //Constructor

    public Persona(){
        
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, char genero, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", direccion=" + direccion + '}';
    }
    
    
    
}
