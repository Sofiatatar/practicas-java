
package guia_5;

import java.util.Scanner;

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido*/

public class Exercise23 {
    
    public static void main(String[] args){
            
        Scanner read = new Scanner(System.in);

        int tamañoVector;
        int cont = 0;

        System.out.println("Ingrese la dimensión que desea para el vector: ");
        tamañoVector = read.nextInt();

        int[] vector = new int[tamañoVector];

        for (int i = 0; i < tamañoVector; i++) {
            vector[i] = (int)(Math.random()* 10 + 1);
        }

        System.out.println("Ingrese el número que desea buscar dentro del vector:");
        int numeroaBuscar = read.nextInt();

        for (int i = 0; i < 10; i++) {

            if (vector[i] == numeroaBuscar) {
                System.out.println("El número fue encontrado en la posición: ["+ i +"]");
                cont++;
            }
        }
        
        System.out.println("El número fue encontrado " + cont+ " veces repetido.");
    }
}
