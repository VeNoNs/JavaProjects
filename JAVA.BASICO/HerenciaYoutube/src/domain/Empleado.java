/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Frank
 */
public class Empleado extends Persona{
    
    //Atributos propios de Empleado
    private int idEmpleado;
    private String cargo;
    private double sueldo;
    
    //Constructores 

    public Empleado() {
    }

    public Empleado(int idEmpleado, String cargo, double sueldo, int id, 
            String dni, String nombre, String apellido, String domicilio, 
            String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    //Metodos

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(super.toString());
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", cargo=").append(cargo);
        sb.append(", sueldo=").append(sueldo);
        sb.append(".");
        return sb.toString();
    }
    
}
