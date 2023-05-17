
package domain;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //BLOQUE DE INICIALIZACION ESTATICO
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10;
    }
    //BLOQUE DE INICIALIZACION NO ESTATICO
    {
        System.out.println("NO ESTATICO");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Hi");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
