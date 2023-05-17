
package ConversionDatos;


public class Ciclos {
    public static void main(String args[]){
        var contador= 0;
        //Ciclo WHILE = si no se cumple la condicion no se ejecuta niguna vez
//        while(contador<3){
//            
//            System.out.println("contador = " + contador);
//            contador++;
//            
//        }
//        
        //CICLO DO WHILE = se ejecuta al menos una vez
        do{
            contador++;
        }while(contador<3);
        
        //FOR 
        for(int aumentador=0;aumentador<3;aumentador++){
            System.out.println("aumentador = " + aumentador);
            if (aumentador % 2 ==0){
                System.out.println("aumentador = " + aumentador);
                break;
            }
        }
        for(int aumentador=0;aumentador<3;aumentador++){
            System.out.println("aumentador = " + aumentador);
            if (aumentador % 2 !=0){
                continue; //ir a la siguiente iteracion
            }
        }
    }
}
