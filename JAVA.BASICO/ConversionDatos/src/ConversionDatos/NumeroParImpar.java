
package ConversionDatos;

public class NumeroParImpar {
    public static void main(String args[]){
        float a =3, b=2;
        if(a%2==0){
            System.out.println("Es un numero par");
        }else{
            System.out.println("Es un numero impar");
        }
        
        //OPERADORES DE ASIGNACION
        a += 1;
        System.out.println("a = " + a);
        b -= 3;
        System.out.println("b = " + b);
        a *= 6;
        System.out.println("a = " + a);
        b /= 3;
        System.out.println("b = " + b);
        a %= 2;
        System.out.println("a = " + a);
        
    }
}
