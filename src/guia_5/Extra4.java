
package guia_5;

import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano*/

public class Extra4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        String numerosRomanos[]={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        
        do{
            
        System.out.println("Ingresa un número entre 1 y 10:");
        numero= scanner.nextInt();      
        
        }while(numero==0);
        
        System.out.println("El equivalente del entero " + numero + " en números Romanos es: " + numerosRomanos[numero-1]);
        
        }
    }
