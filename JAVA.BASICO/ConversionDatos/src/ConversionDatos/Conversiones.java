
package ConversionDatos;

import java.util.Scanner;


public class Conversiones {
    
    
    public static void main(String args[]){
        
        //Conversion de String a Int
        var edad = Integer.parseInt("20");
        //Conversion de de String a Double
        var valorPI = Double.parseDouble("3.14");
        System.out.println(" "+valorPI);
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Tu edad es: "+edad);
        //Entero a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto: "+edadTexto);
        //para recuperar cualquier caracter deentro del string  h=0 o=1 l=2 a=3
        var caracter = "hola".charAt(0);
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter: "+caracter);
    }
}
