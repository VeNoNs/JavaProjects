/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Frank
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
        System.out.println("Dia1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
        indicarDiaSemana(Dias.JUEVES);
        System.out.println("Continente 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("PRIMER DIA DE LA SEMANA");
                break;
            case MARTES:
                System.out.println("SEGUNDO DIA DE LA SEMANA");
                break;
            case MIERCOLES:
                System.out.println("TERCER DIA DE LA SEMANA");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Ultimo dia de la semana");
                break;
            default:
                System.out.println("No corresponde ningun dia de la semana");
        }
    }
}
