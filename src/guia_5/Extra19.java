
package guia_5;

import java.util.Scanner;

/**
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el 
vector.
 * @author Sofi
 */
public class Extra19 {
    public static void main(String[] args) {
        
        int tamañoVector= (int)(Math.random()*20);
        int vector1[]= new int[tamañoVector];
        
        rellenarVector(vector1);
        mostrarVector(vector1);
    }
    
    public static int[] rellenarVector(int[] vector1){
        
        System.out.println("El programa llenara un vector aleatoriamente.");
        for (int i = 0; i <vector1.length; i++) {
            
            vector1[i]= (int)(Math.random()*20);
        }     
        return vector1;
    }
    
    public static void mostrarVector(int[] vector1){
        
        System.out.println("El vector es:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("["+vector1[i]+"]");       
        }
    }
}
