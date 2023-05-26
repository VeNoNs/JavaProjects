
package pkgfor;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio3 {

    /**
     * @Solicita al usuario ingresar un número
     * entero positivo. Para calcular 
     * la suma de los números pares desde 2 hasta
     * el número ingresado. Muestra el resultado 
     * de la suma en pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,suma=0;
        Scanner entrada = new Scanner(System.in);
        
        do{
                System.out.println("Ingresar un Numero positivo: ");
                numero=entrada.nextInt();
            }while(numero<=0);
        //Es hasta el numero ingresado no antes del numero ingresado
        for(int i=0;i<=numero;i++){
            if(i%2==0){
                suma+=i;
            }
            
        }
        System.out.println("Suma de Pares: "+suma);
    }
    
}
