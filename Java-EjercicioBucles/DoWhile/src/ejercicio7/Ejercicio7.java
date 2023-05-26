/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejercicio7 {

    /**
     * @MENU DE LOS EJERCICIOS ANTERIORES
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENU DE EJERCICIOS");
            System.out.println("1.CONVERSION DE DECIMAL A BINARIO");
            System.out.println("2.PIRAMIDE DE 1 Y 0");
            System.out.println("3.FACTORIAL DE UN NUMERO POSITIVO");
            System.out.println("4.VERIFICACION DE NUMEROS PRIMOS");
            System.out.println("5.SECUENCIA FIBONACI");
            System.out.println("6.MAXIMO COMUN DIVISOR");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
        } while (opcion < 0 || opcion > 6);

        switch (opcion) {
            case 1:
                int decimal,
                 residuo;
                String binario = "";
                System.out.println("CONVERCION A BASE BINARIO");
                System.out.println("Ingrese el numero: ");
                decimal = entrada.nextInt();
                do {
                    residuo = decimal % 2;
                    binario = residuo + binario;
                    decimal /= 2;
                } while ((decimal > 0));
                System.out.print(" " + binario);
                break;
            case 2:
                int n;

                int filas = 1;

                System.out.println("Ingresar un numero: ");
                n = entrada.nextInt();

                do {
                    int columnas = 1;
                    do {
                        System.out.print(columnas % 2);
                        columnas++;
                    } while (columnas <= filas);

                    System.out.println();
                    filas++;
                } while (filas <= n);
                break;
            case 3:
                int numero,
                 multiplicacion = 1;

                System.out.println("Ingresar un numero ENTERO POSITIVO: ");
                numero = entrada.nextInt();
                do {
                    multiplicacion *= numero;
                    numero--;
                } while (numero >= 1);

                System.out.println("El factorial es: " + multiplicacion);
                break;
            case 4:
                int numeroD;
                boolean primo = true;

                int divisor = 2;
                System.out.println("Ingrese un numero entero positivo: ");
                numeroD = entrada.nextInt();
                do {
                    if (numeroD % divisor == 0) {
                        primo = false;
                        break;
                    }
                    divisor++;
                } while (divisor <= numeroD / 2);

                if (primo) {
                    System.out.println("Es un numero Primo");
                } else {
                    System.out.println("No es un numero primo");
                }
                break;
            case 5:
                int numero1 = 0,
                 numeroFinal,
                 numero2 = 1,
                 resultadoFibonaci = 0;

                System.out.println("La secuencia de Fibonaci");
                System.out.println("Hasta que numero: ");
                numeroFinal = entrada.nextInt();
                System.out.println("SECUENCIA DE FIBONACI");
                System.out.print(numero1 + "," + numero2 + ",");
                do {
                    resultadoFibonaci = numero2 + numero1;
                    System.out.print(resultadoFibonaci + ",");

                    numero1 = numero2;
                    numero2 = resultadoFibonaci;
                } while (resultadoFibonaci <= numeroFinal);
                break;
            case 6:
                System.out.println("Calculo del Maximo Comun Divisor (MCD)");
                System.out.print("Ingrese el primer numero entero positivo: ");
                int numero3 = entrada.nextInt();
                System.out.print("Ingrese el segundo numero entero positivo: ");
                int numero4 = entrada.nextInt();

                int mcd = 0;
                int resto;

                do {
                    resto = numero3 % numero4;
                    if (resto != 0) {
                        numero3 = numero4;
                        numero4 = resto;
                    } else {
                        mcd = numero4;
                    }
                } while (resto != 0);

                System.out.println("El (MCD) de los números ingresados es: " + mcd);
                break;
        }
    }

}
