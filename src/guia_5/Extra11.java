
package guia_5;

import java.util.Scanner;

/*Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo entero 
truncan los números o resultados.*/

public class Extra11 {
    public static void main(String[] args) {
   
        Scanner read= new Scanner(System.in);
        int numero;
        int cantDigitos=0;
        int cociente;
    
        System.out.println("Ingrese un numero entero, el programa devolvera la "
                + "cantidad de digitos que posee el mismo:");
        numero= read.nextInt();
        
        do {
            cociente= numero/10;
            cantDigitos++;
            numero= cociente;       
        } while (cociente!=0);
        
        System.out.println("El numero ingresado posee: " +cantDigitos+ " digitos.");
    }
    
}
