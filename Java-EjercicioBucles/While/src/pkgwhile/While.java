/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class While {

    /**
     * Escribe un programa en Java que solicite al usuario ingresar 
     * una frase y utilice un bucle while para contar la cantidad 
     * de vocales que contiene la frase. Al finalizar, mostrar el 
     * conteo de cada vocal por separado en pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase= "";
        int contador=0,indice=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CONTADOR DE VOCALES");
        System.out.println("Ingrese una frase o texto: ");
        frase=entrada.nextLine();
        
        while(indice<frase.length()){
            char letra = frase.charAt(indice);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
            indice++;
        }
        System.out.println("El texto tiene: "+contador+" vocales");
    }
    
}
