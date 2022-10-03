
package guia_5;

import java.util.Scanner;

/*. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
 *
 * @author Sofi
 */

public class Extra18 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int [] vectorA;
        int [] vectorB;
        int numero;

        System.out.println("Ingrese un tamaño para los vectores:");
        numero = read.nextInt();
        vectorA = new int[numero];
        vectorB = new int[numero];
        int cont = 0;
        
        for (int i = 0; i < numero; i++) {

            vectorA[i] = (int)(Math.random()*10);
            vectorB[i] = (int) (Math.random()*10);
        }

        for (int i = 0; i < numero; i++) {
            System.out.print("["+ vectorA[i] +"]");
        }
        System.out.println("");
        for (int i = 0; i < numero; i++) {
            System.out.print("[" + vectorB[i]+ "]");
        }
        System.out.println("");
                
        for (int i = 0; i < numero; i++) {
            if (vectorA[i] == vectorB[i]) {
                cont++;
            } else {
                System.out.println("Los vectores no son iguales.");
                break;
            }
        }
        if (cont == (numero - 1)) {
            System.out.println("Los vectores son iguales.");
        }
    }
}