
package test;

import java.util.*;


public class TestColecciones {
    
    public static void main(String[] args) {
        //INTERFACE LIST -----Se respeto el orden-Se puede duplicar elementos       
//Se descarga de java util y se puede agregar la 
        //cantidad que tu quieras es infinito
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        //imprimir(miLista);
        
        //Interface SET ----No se respeta el orden-No duplica elementos
        
        Set miSet = new HashSet();
        miSet.add("ENERO");
        miSet.add("Febrero");
        miSet.add("MARZO");
        miSet.add("ABRIL");
        miSet.add("ABRIL");
        
        imprimir(miSet);
        
        
        //Interface MAP
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Frank");
        miMapa.put("Valor3", "Diana");
        miMapa.put("Valor4", "Camila");
        
        String elemento = (String)miMapa.get("Valor1");
        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        for (Object elemento: coleccion) {
            System.out.println("elemento = " + elemento);
        }
        
        coleccion.forEach(elemento->{
            System.out.println("elemento = " + elemento);
        });
    }
    
    
    
    
    
        
    
}
