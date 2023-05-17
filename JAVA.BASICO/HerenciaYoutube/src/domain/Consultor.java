
package domain;


public class Consultor extends Persona{
    
    
    //Atributos
    private String nombreConsultora;
    private int idConsultora;

    public Consultor() {
    }

    public Consultor(String nombreConsultora, int idConsultora, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.idConsultora = idConsultora;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getIdConsultora() {
        return idConsultora;
    }

    public void setIdConsultora(int idConsultora) {
        this.idConsultora = idConsultora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consultor{");
        sb.append("nombreConsultora=").append(nombreConsultora);
        sb.append(", idConsultora=").append(idConsultora);
        sb.append('}');
        return sb.toString();
    }
    
    
}
