
package domain;

//Hace que no se pueda crear clases hijas
public final class Persona {
    //Se denomina constante y se escribe en mayuscula
    public final static int MI_CONSTANTE=1;
    private String nombre;
    


// Hace que no s epueda llamar desde las clases hijas y ni modificar el metodo    
    public final void imprimir(){
        System.out.println("this = " + this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
