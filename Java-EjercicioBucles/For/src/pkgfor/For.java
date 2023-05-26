package pkgfor;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class For {

    /**
     * Escribir un programa para recoger los votos de 10 personas que elegirán
     * un color para una campaña publicitaria. Los colores son: celeste, morado
     * y turquesa.Mostrar al final, cuántos votos obtuvo cada color, su
     * porcentaje y qué color resultó elegido.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion, votoC=0, votoT=0, votoM=0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Ingrese su voto:");
                System.out.println("1.CELESTE");
                System.out.println("2.MORADO");
                System.out.println("3.TURQUESA");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 3);
            switch (opcion) {
                case 1:
                    votoC++;
                    break;
                case 2:
                    votoM++;
                    break;
                case 3:
                    votoT++;
                    break;

            }
        }
        System.out.println("Votos de la encuesta");
        System.out.println("CELESTES: "+votoC);
        System.out.println("MORADO: "+votoM);
        System.out.println("TURQUESA: "+votoT);
    }

}
