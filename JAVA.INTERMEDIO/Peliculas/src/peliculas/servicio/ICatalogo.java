
package peliculas.servicio;


public interface ICatalogo {
    
    String NOMBRE_RECURSO="peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPeliculas(String buscar);
    
    void iniciarCatalogo();
    
    
    
}
