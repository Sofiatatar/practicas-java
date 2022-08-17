
package Guía_5_Java;

import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String.
 */
public class Extra3 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String arrayVocales[] = {"A","E","I","O","U"};
        String letra;
        boolean vocal=false;
        
        System.out.println("Ingrese una letra, el sistema comprobara si se trata de una vocal:");
        letra = read.next();
        
        for (int i = 0; i < arrayVocales.length; i++) {
            
            if (letra.equalsIgnoreCase(arrayVocales[i])){
                vocal = true;
                System.out.println("La letra es una vocal");
                break;
            }
        }    
        
        if (vocal== false){
            System.out.println("La letra no es una vocal");
        }
    }
}
