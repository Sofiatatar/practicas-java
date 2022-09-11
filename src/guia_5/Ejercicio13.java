package Guía_5_Java;

import java.util.*;

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. */

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int nota;

        do {
            System.out.println("Ingrese una nota (debe estar entre los valores 0 y 10).");
            nota = read.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada es INCORRECTA. Por favor reingrésela:");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("La nota ingresada es CORRECTA.");

    }
}
