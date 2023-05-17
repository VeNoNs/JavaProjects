/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Frank
 */
public class Privado {

    private String atributoPrivado = "Valor de Atributo Privado";

    // Constructor privado solo se usa dentro de la misma clase
    private Privado() {
        System.out.println("Constructor Privado");

    }

    public Privado(String args){
        this();// para llamar al constructor privado
        System.out.println("Constructor publico");
    }
    private void metodoPrivado() {
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }

}
