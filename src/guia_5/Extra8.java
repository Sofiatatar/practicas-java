package guia_5;

/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break. */

import java.util.Scanner;

public class Extra8 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num;
        int pares = 0; 
        int impares = 0;
        int canttotal = 0;
  
        do {
            System.out.println("Ingrese números enteros. Para salir ingrese un múltiplo de 5:");
            num = read.nextInt();
            if (num < 0) {
                continue;
            }
            canttotal++;
            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
            if ((num % 5) == 0) {
                if (num % 2 == 0){
                    pares--;  
                }
                else{
                    impares--;
                }
                break;
            }
        } while ((num % 5 == 0) != true);

        System.out.println("Se ingresaron un total de: " + (canttotal-1) + " valores, de los cuales: " + pares + " fueron valores pares y " + impares + " valores impares.");
    }
}
