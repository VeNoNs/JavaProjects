
package Operaciones;


public class PruebaAritmetica {
    
    public static void main(String args[]){
        Aritmetica s1 = new Aritmetica();
        System.out.println("s1 A: "+s1.a);
        System.out.println("S1 B: "+s1.b);
        
        Aritmetica s2 = new Aritmetica(13, 56);
        System.out.println("s2 A: "+s2.a);
        System.out.println("S2 B: "+s2.b);
//        s1.a=10;
//        s1.b=2;
//        s1.suma();
//        s1.resta();
//        s1.multiplicacion();
//        s1.division();
//        
//        // El valor que retorna se declara en esta variable sino queda en el aire
//        int d = s1.sumaRetorno();
//        System.out.println("d = " + d);
//        
//        d = s1.sumarConArgumentos(10, 9);
//        System.out.println("d = " + d);
       
        
    }
    
    
}
