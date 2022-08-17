package Guía_5_Java;

import java.util.*;

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java*/

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        String eureka = "eureka";
        
        System.out.println("Ingrese una frase:");
        String frase = lector.nextLine();
        
        if (frase.equals(eureka)) { //funcion para comparar dos cadenas.
            System.out.println("La frase ingresada es correcta.");
        } else {
            System.out.println("La frase ingresada es incorrecta.");
        }
    }
}
