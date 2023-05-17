
package accesodatos;


public interface IAccesoDatos {
    
    
    //Atributos
    int MAX_REGISTRO= 10;
    
    
    //METODOS
    //No tiene constructores y todos los metodos son abstractos
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
