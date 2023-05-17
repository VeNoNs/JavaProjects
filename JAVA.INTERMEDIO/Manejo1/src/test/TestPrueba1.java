package test;

import aritmetica.Aritmetica;

public class TestPrueba1 {

    public static void main(String[] args) {
        int resultado=0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch (Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } 
        finally{//SIEMPRE SE EJECUTA A PESAR DE HABER ERRORES
            System.out.println("Se reviso el error");
        }
            System.out.println("resultado = " + resultado);
        }

    }
