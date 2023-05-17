
package test;

import accesodatos.*;


public class TestInterfaces {
    
    public static void main(String[] args) {
        IAccesoDatos datos= new ImplementacionMySql();
        //datos.listar();
        imprimir(datos);//Se manda a llamar a el metodo imprimir de abajo
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
