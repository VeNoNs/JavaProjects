
package test;

import java.util.*;


public class TestColeccionesGenericas {
    
    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        
        //Interface SET ----No se respeta el orden-No duplica elementos
        
        Set<String> miSet = new HashSet<>();
        miSet.add("ENERO");
        miSet.add("Febrero");
        miSet.add("MARZO");
        miSet.add("ABRIL");
        miSet.add("ABRIL");
        
//        imprimir(miSet);
        
        
        //Interface MAP
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Frank");
        miMapa.put("Valor3", "Diana");
        miMapa.put("Valor4", "Camila");
        miMapa.put("Valor4", "Andres");//Toma como valor el utimo
        
        //String elementoMapa = miMapa.get("Valor1");
       // System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
       imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion){
//        for (String elemento: coleccion) {
//            System.out.println("elemento = " + elemento);
//        }
        
        coleccion.forEach(elemento->{
            System.out.println("elemento = " + elemento);
        });
    }
    
    
    
    
    
        
    
}
