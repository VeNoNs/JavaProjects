package peliculas.presentacion;

import java.util.Scanner;
import peliculas.servicio.*;

public class PresentacionUsuario {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogo catalogo = new ImplCatalogo();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1.Iniciar catalogo peliculas\n"
                    + "2. Agregar peliculas\n"
                    + "3. Listar peliculas\n"
                    + "4. Buscar Peliculas\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogo();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la Pelicula");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula para buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("Hasta PRONTO");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                            
                    break;
            }
        }
    }

}
