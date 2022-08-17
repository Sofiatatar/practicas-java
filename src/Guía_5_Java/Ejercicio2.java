package Guía_5_Java;

import java.util.*;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma*/

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese el primer número entero: ");
        num1 = read.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        num2 = read.nextInt();

        System.out.println("La suma de ambos números es: " + (num1 + num2));

    }
}
