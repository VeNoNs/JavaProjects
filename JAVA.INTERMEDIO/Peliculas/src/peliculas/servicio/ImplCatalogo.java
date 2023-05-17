package peliculas.servicio;

import datos.AcceDa;
import datos.AccesoDatos;
import domain.Pelicula;
import peliculas.ex.AccesoDatosEx;

public class ImplCatalogo implements ICatalogo {

    private final AcceDa datos;

    public ImplCatalogo() {
        this.datos = new AccesoDatos();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);

        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos ");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try{
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        }catch(AccesoDatosEx ex){
            System.out.println("Error al buscar pelicula");
            ex.printStackTrace(System.out);
        }
        System.out.println(" " +resultado );

    }

    @Override
    public void iniciarCatalogo() {
    try{
        if(this.datos.existe(NOMBRE_RECURSO)){
        datos.borrar(NOMBRE_RECURSO);
        datos.crear(NOMBRE_RECURSO);
    }else{
        datos.crear(NOMBRE_RECURSO);
    }}catch(AccesoDatosEx ex){
        System.out.println("Error al Iniciar el catalogo de peliculas");
        ex.printStackTrace(System.out);
    }
    }
}
