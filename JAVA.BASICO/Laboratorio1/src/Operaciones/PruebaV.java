
package Operaciones;


public class PruebaV {
    
    public static void main(String[] args) {
        int vol;
        //Aqui se uso el constructor vacio
        Caja p1 = new Caja();
        p1.alto=2;
        p1.ancho=3;
        p1.profundo=6;
        
        vol = p1.Volumen();
        
        System.out.println("vol = " + vol);
        
        
        //Aqui se uso el constructor con argumentos
        
        Caja p2 =new Caja(3, 5, 6);
        vol = p2.Volumen();
        System.out.println("vol2 = " + vol);
    }
    
    
}
