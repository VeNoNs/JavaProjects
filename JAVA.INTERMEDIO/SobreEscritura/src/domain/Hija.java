
package domain;


public class Hija extends Padre{
    
    private String departamento;
    
    public Hija(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    //Aqui se sobreescribe el metodo de la clase padre
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", departamento: "+this.departamento;
    }
    
}
