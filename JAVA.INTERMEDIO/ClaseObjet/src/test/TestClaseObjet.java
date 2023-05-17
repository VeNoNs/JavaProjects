
package test;

import domain.Padre;


public class TestClaseObjet {
    
    public static void main(String[] args) {
        Padre padre1 = new Padre("Pedro", 5000);
        Padre padre2 = new Padre("Juan",5000);
        if(padre1==padre2){
        System.out.println("Tienen la misma referencia en memoria");
                
    }
        else{
            System.out.println("No tienen la misma referencia en memoria");
            } 
        
        //Hace la comparacion de los dos objetos y tiene que ser igual tanto
        //En el nombre como en el contenido
        if(padre1.equals(padre2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
            
    if(padre1.hashCode()==padre2.hashCode()){
        System.out.println("El valor hashcode es igual");
    }
    else{
        System.out.println("El valor de hashcode es distinto");
    }
    
    }
    
}
