
package domain;


public class Empleado extends Persona{
    
    //Atributos
    private int idEmpleado;
    private double sueldo;
    
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    public Empleado(String nombre, double sueldo) {
// Primera manera de llamar nmombre a la clase padre
//        super(nombre);
//        this.idEmpleado = ++Empleado.contadorEmpleado;
        //SEGUNDA manera de llamar la clase nombre y usar otro constructor dentro
        this();//Se esta llamando al contrustor de arriba
        this.nombre = nombre;//ES la otra manera de entrar a la clase padre
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
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
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append("Empleado=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        //Otra forma es la siguiente
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
