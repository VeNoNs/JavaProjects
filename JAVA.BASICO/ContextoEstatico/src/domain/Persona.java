
package domain;


public class Persona {

    //Atributos
    private int idPersona;
    private String nombre;
    //STATIC funciona como un if que cuando se usa el constructor auemntara
    //se asocia a la clase y no a los objetos creados
    //NO se reinicia al mandar a llamr al constructor por eso se USA STATIC
    private static int contadorPersonas;
    
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        //NO ESTATICA SE USA EL THIS 
        // SI ES ESTATICO SE USA EL NOMBRE DE LA CLASE
        this.idPersona = Persona.contadorPersonas;
        
    }


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
