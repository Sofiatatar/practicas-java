package guia_5;

import java.util.*;

/*Crear un programa que dado un numero determine si es par o impar*/

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero:");
        int num = lector.nextInt();

        if (num % 2 == 0) { //% operador para obtener el resto.
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }
}
