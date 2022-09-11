package guia_5;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial.*/

public class Exercise14 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int limitValue;
        int sum = 0; 
        int number;

        System.out.println("Ingrese un valor positivo, este será su valor límite: ");
        limitValue = read.nextInt();

        do {
            System.out.println("Ingrese valores enteros positivos - estos se le pediran hasta que la suma de los mismos supere el valor límite-.");
            number = read.nextInt();
            if (number > 0) {
                sum += number;
            } else {
                System.out.println("El número ingresado no es válido, no será tenido en cuenta.");
            }
        } while (sum < limitValue);

        System.out.println("La suma de los números ingresados es: " + sum + " y la misma ha superado el valor límite de: " + limitValue + ".");

    }

}
