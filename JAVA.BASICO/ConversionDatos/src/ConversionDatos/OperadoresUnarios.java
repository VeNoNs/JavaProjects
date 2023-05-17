
package ConversionDatos;


public class OperadoresUnarios {
    public static void main(String args[]){
        boolean c = true;
        boolean d = !c;
        
        //incremento 
        int a = 3;// a =3
        int b= ++a;// b=4 y a=4
        //postincremento
        int e = 3;// e =3
        int f= e++;// f=3 y e=4
        
         //decremento 
        int g = 3;// g =3
        int h= --g;// h=2 y g=2
        //postdecremento
        int i = 3;// i =3
        int j = i--;// j=3 y i=2
        
        //igualdad y relaciones 
        
        var aa = 3;
        var bb = 2;
        
        var cc = (aa == bb);
        var dd = aa != b;
        
        var cadena = "Hola";
        var cadena1 = "Adios";
        
        var ee = cadena == cadena1;  // compara referencias de objetos
        var ff = cadena.equals(cadena1);// verifica si tiene el mismo contenido
        
        
    }
}
