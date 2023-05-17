
package test;


public class Test {
    
    public static void main(String[] args) {
        //Clases envoolventes 
        /*
        int-Integer
        long-Long
        float-Float
        double-Double
        boolean - Boolean
        byte- Byte
        char- Character
        short-Short
        */
        
        Integer entero = 10;//Autoboxing
        
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        
        int entero2 =entero;//Unboxing
        
        System.out.println("entero2 = " + entero2);
    }
    
}
