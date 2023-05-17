
package pasoporvalor;


public class PasoPorValor {
    
    public static void main(String[] args) {
        
        //Cuando se trata de variables primitivas no se puede cambiar de valor 
        int x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        
        System.out.println("nuevo valor de x = " + x);
        
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        
        arg1 =15;
    }
}
