
package Operaciones;


public class Caja {
    
    //Atributos
    int ancho;
    int alto;
    int profundo;
    
    //Constructores 
    
    public Caja(){
        
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int Volumen(){
        
        return ancho*alto*profundo;
    }
    
}
