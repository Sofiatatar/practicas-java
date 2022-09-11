
package guia_5;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double gradosC;
        double gradosF;
        
        System.out.println("Ingrese los grados C°");
        gradosC = lector.nextDouble();
        
        gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("El equivalente en grados Fahrenheit es: " + gradosF);

    }
}
