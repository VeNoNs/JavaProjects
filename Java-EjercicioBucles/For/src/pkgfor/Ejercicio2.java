package pkgfor;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio2 {

    /**
     * Solicita al usuario ingresar un número entero positivo.
     * Para imprimir en pantalla los números
     * impares desde 1 hasta el número ingresado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        do{
                System.out.println("Ingresar un Numero positivo: ");
                numero=entrada.nextInt();
            }while(numero<=0);
        for(int i=0;i<numero;i++){
            if(i%2==0){
                
            }else{
                System.out.print(" "+i+",");
            }
            
        }
    }

}
