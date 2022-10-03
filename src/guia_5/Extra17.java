
package guia_5;

import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario.*/

public class Extra17 {
    public static void main(String[] args) {
        
        Scanner scaner= new Scanner(System.in);
        int tamañoVector;
        int numero;
        int suma=0; 
        Integer numeros[];
        
        System.out.println("Ingrese la cantidad de elementos a almacenar:");
        tamañoVector= scaner.nextInt();
        numeros= new Integer[tamañoVector];
        
        System.out.println("El programa le pedira uno a uno los numeros a almacenar en el vector.");
        
        for (int i = 0; i < tamañoVector; i++) {
            
            System.out.println("Ingrese el número a almacenar.");
            numero= scaner.nextInt();  
            numeros[i]=numero;
            suma+=numero; 
        }
        
        System.out.println("La suma de todos los elementos ingresados al vector es: "+suma);
        
        
       
        
    }
}
