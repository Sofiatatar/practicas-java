
package guia_5;

import java.util.*;

/*Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla*/

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un número entero:");
        num1 = lector.nextInt(); //declaro e inicializo en una sola línea.
        
        System.out.println("Ingrese un número entero:");
        num2 = lector.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor número ingresado es: " + num1);
        } else {
            System.out.println("El mayor número ingresado es: " + num2);
        }
    }
}
