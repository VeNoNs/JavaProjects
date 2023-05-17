
package ConversionDatos;

import java.util.Scanner;


public class TiendaLibros {
     public static void main(String args[]){
         var consola = new Scanner(System.in);
         System.out.println("Proporciona el nombre: ");
         var nombre = consola.nextLine();
    
         System.out.println("Proporciona el id: ");
         var id = consola.nextLine();
     
         System.out.println("Proporciona el precio: ");
         var precio = consola.nextLine();
        
         System.out.println("Proporciona el envio gratuito: ");
         var envio = consola.nextLine();
         if(envio=="true" || envio=="TRUE"){
             System.out.println(" "+nombre+" #"+id);
             System.out.println("El precio es: "+precio);
             System.out.println("Envio Gratuito "+envio);
             
         }else{
             System.out.println(" "+nombre+" #"+id);
             System.out.println("El precio es: "+precio);
             System.out.println("Envio Gratuito: "+envio);
         }
         
           
     }
             
}
//   Resolucion del profesor al ejercicio
//  Scanner scanner = new Scanner(System.in);
//        System.out.println("Proporciona el nombre:");
//        String nombre = scanner.nextLine();
//        System.out.println("Proporciona el id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Proporciona el precio:");
//        double precio = Double.parseDouble(scanner.nextLine());
//        System.out.println("Proporciona el envio gratuito:");
//        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
// 
//        System.out.println(nombre + " #" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envio Gratuito: " + envioGratuito);
