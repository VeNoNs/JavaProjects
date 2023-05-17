/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Frank
 */
public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        
        imprimirNumeros(3,4,5);
        imprimirNumeros(2,7,8,9,3);
        
    }
    //Si se va a definir un argumento variable se define al final de todo
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    // los ... indica que se va a recibir argumentos variables hasta que se
    //ejecute dicho metodo recien podremos saber cuantos son
    //La dieferencia de trabajar con u arreglo es que 
    // en un arreglo debes saber con cuantos numeros vas a trabjar
    // y con argumentos variables se define despues 
    //pero se comportan de la misma manera
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: = " + numeros[i]);
        }
    }
    
}
