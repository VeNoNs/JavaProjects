
package datos;

import domain.Pelicula;
import java.util.List;
import peliculas.ex.*;



public interface AcceDa {
    
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    
    List<Pelicula> listar(String nombreArchivo) throws LecturaEx;
    
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraEx;
    
    String buscar(String nombreArchivo, String buscar) throws LecturaEx;
    
    void crear(String nombreRecurso) throws AccesoDatosEx;
    void borrar(String nombreRecurso) throws AccesoDatosEx;
    
    
}
