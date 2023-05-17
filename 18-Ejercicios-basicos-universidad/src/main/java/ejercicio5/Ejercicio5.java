package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio5 {

    /**
     * Escribir un programa en Java que lea las horas, minutos y segundos
     * individualmente, y calcule qué hora sería en el siguiente segundo.​
     * Validar los valores ingresados de ​las horas (0-23), minutos (0-59) ​y
     * segundos (0-59).​
     */
    public static void main(String[] args) {
        //1.Variables
        int hora, minutos, segundos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la hora en el orden indicado");
        System.out.println("1.Hora(0-23): ");
        hora = entrada.nextInt();
        System.out.println("2.Minutos(0-59): ");
        minutos = entrada.nextInt();
        System.out.println("3.Segundos(0-59): ");
        segundos = entrada.nextInt();

        if (segundos > -1 && segundos < 60 && minutos > -1 && minutos < 60 && hora > -1 && hora < 24) {
            if (segundos > -1 && segundos < 59) {
                segundos++;
            } else {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                hora++;
            }
            if (hora == 24) {
                hora = 00;
            }
            System.out.printf("La Hora siguiente es: %02d:%02d:%02d", hora, minutos, segundos);
        } else {
            System.out.println("Ingreso un valor incorrecto");
        }

    }

}
