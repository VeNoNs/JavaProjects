package paquete1;

public class Clase2 {
//Todo lo que es protegido solo se puede acceder desde clases hijas
    //desde otra clase no se puede acceder
    protected String atributoProtected = "Atributo Protected";

    protected Clase2() {
        System.out.println("Constructor Protegido");
        //Se puede mandara llamar desde clases hijas mas no 
        //desde otras clases ya qyueesta protegido
    }
    public Clase2(String arg){
        System.out.println("Constructor publico");
    }

    protected void metodoProtegido() {
        System.out.println("Metodo Protegido");
    }

}
