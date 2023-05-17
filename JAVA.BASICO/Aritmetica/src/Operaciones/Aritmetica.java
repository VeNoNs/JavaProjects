
package Operaciones;


public class Aritmetica {
    
    //Atributos
    int a;
    int b;
    
    //Contructores vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor ");
    }
    
    //Sobrecarga de constructores
    public Aritmetica(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Ejecutando constructor con argumentos ");
    }
    
    //Metodos
    //void = El tipo de valor que queremos regresar ejm int,float
    public void suma(){
        int c = a+b;
        System.out.println("c = " + c);
    }
    public int sumaRetorno(){
        return a+b;
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b= b;
        //return a+b;
        return this.sumaRetorno();
    }
    public void resta(){
        int c = a-b;
        System.out.println("c = " + c);
    }
    public void multiplicacion(){
        int c =a*b;
        System.out.println("c = " + c);
    }
    public void division(){
        int c =a/b;
        System.out.println("c = " + c);
    }
}
