
package Guía_5_Java;

import java.util.*;

/*Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú.

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/

public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int num1;
        int num2;
        int menu;
        boolean fin = false;
        
        System.out.println("Ingrese dos números enteros positivos: ");
        num1 = lector.nextInt();
        num2 = lector.nextInt();

        do {
            System.out.println("Seleccione una opción: \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Salir");
            menu = lector.nextInt();
            
            switch (menu) {
                
                case 1:
                    System.out.println("La suma de los valores ingresados es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los valores ingresados es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los valores es: " + (num1 * num2));
                    break;
                case 4:

                    if (num2 == 0) {
                        System.out.println("No puede dividirse por 0");
                    } else {
                        System.out.println("La división de los valores es: " + ((float) num1 / num2));
                    }
                    break;
                    
                case 5:
                    System.out.println("Seguro que desea salir del programa (S/N)?");
                    
                    if (lector.next().equalsIgnoreCase("S")) {
                        fin = true;
                    }
                    break;
                    
                default:
                    System.out.println("La opción ingresada no es válida, vuelva a ingresarla: ");
            }
        } while (fin == false);

        System.out.println("El programa ha finalizado.");

    }
}
