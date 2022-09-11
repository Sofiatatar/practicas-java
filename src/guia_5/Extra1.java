package Guía_5_Java;

import java.util.Scanner;

/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.
 */

public class Extra1 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int tiempoMin;
        int calculoHoras;
        int calculoDias;
        
        System.out.println("Ingrese el tiempo en minutos que desea convertir:");
        tiempoMin= read.nextInt();
        
        calculoDias = (tiempoMin / 1440);
        calculoHoras = ((tiempoMin % 1440) / 60);
        
        System.out.println(tiempoMin + " equivalen a " + calculoDias + " días, " + calculoHoras + " horas.");
            
    }   
}
