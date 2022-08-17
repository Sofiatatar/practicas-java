
package Guía_5_Java;

import java.util.*;

/*. Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()*/

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int num;
    
        System.out.println("Ingrese un número entero: ");
        num= lector.nextInt();
        
        System.out.println("El número ingresado es: " + num);
        System.out.println("Su doble es: "+ (num*2));
        System.out.println("Su triple es: " + (num*3));
        System.out.println("Su raíz cuadrada es: " + Math.sqrt(num)); //método 
                                                    //para calcular raíces

    }
}
