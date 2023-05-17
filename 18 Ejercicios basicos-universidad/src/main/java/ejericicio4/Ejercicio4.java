/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio4;

import java.util.Scanner;

/**
 *
 * @author Frank Erick Ortiz Cano
 */
public class Ejercicio4 {

    /**
     * El gobierno ha decretado un aumento en los ​salarios de los altos
     * funcionarios de acuerdo ​a la siguiente escala:​ SEXO SALUD EDUCACION
     * TRANSPORTE Femenino 25% 12% 20% Masculino 20% 11% 15%
     *
     * Los salarios actuales son: Salud (S/.15000), ​ Educación (S/.12000),
     * Transporte (S/. 18000)​
     *
     * Escribir un programa en Java que solicite el sexo y sector de un
     * funcionario y calcular el monto que percibirá luego de aplicado el
     * aumento.​
     */
    public static void main(String[] args) {
        //1.Variables
        double salarioAntiguo, salarioActual=0, aumento;
        int funcionario;
        String sexo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("1.SALUD");
        System.out.println("2.EDUCACION");
        System.out.println("3.TRANSPORTE");
        System.out.println("Ingrese el numero de su Sector de Trabajo: ");
        funcionario = entrada.nextInt();
        System.out.println("Ingrese su sexo (M/F)");
        sexo = entrada.next();

        switch (funcionario) {
            case 1:
                if (sexo.equals("F")) {
                    salarioAntiguo = 15000;
                    aumento = 0.25 * salarioAntiguo;
                    salarioActual = salarioAntiguo + aumento;
                } else {
                    salarioAntiguo = 15000;
                    aumento = 0.2 * salarioAntiguo;
                    salarioActual = salarioAntiguo + aumento;
                }
                break;
            case 2:
                if (sexo.equals("F")) {
                    salarioAntiguo = 12000;
                    aumento = 0.12 * salarioAntiguo;
                    salarioActual = salarioAntiguo + aumento;
                } else {
                    salarioAntiguo = 12000;
                    aumento = 0.11 * salarioAntiguo;
                    salarioActual = salarioAntiguo + aumento;
                }
                break;
            case 3:
                if (sexo.equals("F")) {
                    salarioAntiguo = 18000;
                    aumento = 0.2 * salarioAntiguo;
                    salarioActual = salarioAntiguo + aumento;
                } else {
                    salarioAntiguo = 18000;
                    aumento = 0.15 * salarioAntiguo;
                    salarioActual = salarioAntiguo + aumento;
                }
                break;
            default:
                System.out.println("Ingreso un sector que no existe");
        }
        
        System.out.println("Su salario actual es: $/"+salarioActual);

    }

}
