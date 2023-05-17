//documentar la clase
public class HolaMundo {
    public static void main(String args[]){
        //Se define variables 
        int miVariableEntera = 10;
        float segundaVariable =46;
        
        System.out.println(miVariableEntera);
        System.out.println("Hola Mundo");
        //Se puede modificar el valor de la variable
        miVariableEntera = 5;
        System.out.println(segundaVariable);
        System.out.println(miVariableEntera);
        
        //Variable String 
        
        String variableCadena = "Hola causeta";
        
        System.out.println(variableCadena);
        
        // sout + tabulador para el systemprint
        // Ctrl + espacio = te da opciones
        
        variableCadena = "ADIOS";
        System.out.println(variableCadena);
        
        // var -inferencia de tipos de datos
        
        var miVariableEntera2 = 98;
        System.out.println(miVariableEntera2);
        
        var cadena = "hola fast mathoer ";
        System.out.println(cadena);
        
        //Valores permitidos en las declaracion de variables 
        
        var mioVarible = 1;
        var _mioVarible = 2;
        var $mioVariable = 3;
        
        // No se recomienda utilizar primero los numeros
        //, letras con tildes y 
        //caracteres especiales 
        
        
        //TIPOS DE VARIABLES
        
        float numerofloat = 3274523F;
        System.out.println(" Min "+Float.MIN_VALUE);
        System.out.println(" Max "+Float.MAX_VALUE);   
        double numerodouble = 3782467D;
        System.out.println(" Min "+Double.MIN_VALUE);
        System.out.println(" Max "+Double.MAX_VALUE);   
        byte numerobyte =3;
        System.out.println(" Min "+Byte.MIN_VALUE);
        System.out.println(" Max "+Byte.MAX_VALUE); 
        short numeroshort = 243;
        System.out.println(" Min "+Short.MIN_VALUE);
        System.out.println(" Max "+Short.MAX_VALUE);
        int numeroint = 8968;
        System.out.println(" Min "+Integer.MIN_VALUE);
        System.out.println(" Max "+Integer.MAX_VALUE);
        long numerolong =237465;
        System.out.println(" Min "+Long.MIN_VALUE);
        System.out.println(" Max "+Long.MAX_VALUE);  
        
        
        char miCaracter = '\u0021';
        System.out.println(" "+miCaracter);
        
        char miCaracter2 = 33;
        System.out.println(" "+miCaracter2);
        boolean varBoolean = false;
        System.out.println(" "+varBoolean);
        if(varBoolean){
            //se imprime el valor verdadero
        }
        else{
            //se imprime el valor falso
        }
    }
}
