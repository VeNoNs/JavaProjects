
package clases;


public class Main {
  public static void main(String args[]){
      
      //Creacion de objetos de la clase persona
      
      Persona persona1= new Persona();
      persona1.NOMBRE= "Frank";
      persona1.apellido= "Ortiz";
      persona1.edad= 26;
      
      persona1.desplegarInformacion();
      
      //Creacion de un objeto2
      
      Persona p2 = new Persona();
      p2.NOMBRE= "Erick";
      p2.apellido= "Cano";
      p2.edad= 22;
      p2.desplegarInformacion();
      
  }  
}
