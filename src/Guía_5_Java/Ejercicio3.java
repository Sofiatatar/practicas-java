
package Guía_5_Java;

import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = lector.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }

}
