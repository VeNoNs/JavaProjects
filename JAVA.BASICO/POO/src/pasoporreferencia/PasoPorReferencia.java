
package pasoporreferencia;

import clases.Persona;


public class PasoPorReferencia {
    
    public static void main(String[] args) {
        // Cuando se trata de objetos se puede cambiar de valor 
        Persona p1 = new Persona();
        //Persona p1 = null; SE USA SOLO PARA DEMOSTRAR EL RETURN NULL 
        p1.NOMBRE = "Pedro";
        System.out.println("p1 = " + p1.NOMBRE);
        p1 = cambiaValor(p1);
        System.out.println("p1 = " + p1.NOMBRE);
    }
  //Regresa el objeto de tipo persona 
    public static Persona cambiaValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona invalido: null");
            return null;
        }
        
        persona.NOMBRE = "Karla";
        return persona;
        //Despues de la palabra return no se puede poner mas lineas de codigo
    }
    
//    public static void cambiaValor(Persona persona){
//        
//        persona.NOMBRE = "Karla";
//        return; 11esto es automatico cuando se esta usando void por
//            11eso no se coloca siempre y cuadno no se retorne ningun valor
//    }
}
