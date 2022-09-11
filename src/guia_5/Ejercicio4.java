
package Guía_5_Java;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import java.util.Scanner;
import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toLowerCase;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase()*/

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = lector.nextLine();
        
        System.out.println("La frase ingresada es: " + toUpperCase(frase));
        System.out.println("La frase ingresada es: " + toLowerCase(frase));
    }

}
