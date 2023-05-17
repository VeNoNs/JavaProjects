
package test;

import domain.Persona;


public class TestMatrices {
    
    public static void main(String[] args) {
        
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 10;
        edades[1][0] = 56;
        edades[1][1] = 3;
        
        // va por toda la matriz primer FOR recorre las  filas 
        //segundo for recorre las columnas que hay en la fila
        //Siempre se empieza leyendo las filas y de ahi las columnas
        
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades "+ren+" "+col+": "+edades[ren][col]);
            }
            
        }
        
        String frutas[][] = {{"Naranja","limon"},{"fresa","zarsamora"},{"pepinillo","lengua"}};
        
        imprimir(frutas);
        
        //Matrices de Objetos
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Frank");
        personas[0][1] = new Persona("Diana");
        personas[0][2] = new Persona("Camila");
        personas[1][0] = new Persona("Erick");
        personas[1][1] = new Persona("Juan");
        personas[1][2] = new Persona("Ortiz");
       
        imprimir(personas);
       
    }
    public static void imprimir(Object matriz[][]){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                 System.out.println("matriz "+fila+" "+col+": "+matriz[fila][col]);
            }
        }
    }
}
