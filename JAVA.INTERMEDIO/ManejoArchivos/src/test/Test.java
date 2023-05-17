package test;

import manejoarchivos.ManejoArchivos;


public class Test {
    
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //ManejoArchivos.crearArchivo(nombreArchivo);
        
        ManejoArchivos.escribirArchivo(nombreArchivo, "Hola desde java");
        
        ManejoArchivos.anexarArchivo(nombreArchivo, "Holas que haces ");
        
        ManejoArchivos.leerArchivo(nombreArchivo);
        
    }
    
}
