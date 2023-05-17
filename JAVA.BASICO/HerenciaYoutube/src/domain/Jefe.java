
package domain;


public class Jefe extends Persona{
    
    //Atributos
    private int idJefe;
    private String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int idJefe, String departamentoJefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jefe{");
        sb.append("idJefe=").append(idJefe);
        sb.append(", departamentoJefe=").append(departamentoJefe);
        sb.append('}');
        return sb.toString();
    }

   
}
