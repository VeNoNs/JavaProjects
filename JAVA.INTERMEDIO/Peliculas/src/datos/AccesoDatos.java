package datos;

import domain.Pelicula;
import java.io.*;
import java.util.*;
import peliculas.ex.*;

public class AccesoDatos implements AcceDa {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaEx("Excepcion A lISTAR PELICULAS: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaEx("Excepcion A lISTAR PELICULAS: " + ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se a escrito la informacion a la pelicula " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraEx("Excepcion A ESCRIBIR PELICULAS: " + ex.getMessage());
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaEx {
        var archivo = new File(nombreArchivo);
        String resultado = null;
        
        try {

            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            //linea = entrada.readLine();
            int indice = 1;
            while ((linea = entrada.readLine())!= null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + "encontrada en el indice " + indice;
                   
                    break;
                }
                //linea = entrada.readLine();
                
                indice++;
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaEx("Excepcion AL BUSCAR PELICULAS: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaEx("Excepcion A BUSCAR PELICULAS: " + ex.getMessage());
        }
        
        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se creo archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion AL CREAR PELICULAS: " + ex.getMessage());
        }

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }

}
