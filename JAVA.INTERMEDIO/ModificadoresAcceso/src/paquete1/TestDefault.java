
package paquete1;


public class TestDefault {
    
    public static void main(String[] args) {
        Clase3 clase3 = new Clase3();
        clase3.atributoDefault ="Cambio desde la prueba";
        System.out.println("clase3 = " + clase3.atributoDefault);
        clase3.metodoDefault();
        
        
        Privado privado = new Privado("Publico");//S e manda a llamar al 
        //constructor publico de la clase privada para asi acceder al privado
        //por la palabra this
        
        privado.setAtributoPrivado("Cambio del atributo privado");
        System.out.println("privado = " + privado.getAtributoPrivado());
    }
    
}
