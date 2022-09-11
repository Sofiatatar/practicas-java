package guia_5;

import java.util.Scanner;

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * * */

public class Exercise19 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int elements;
        
        System.out.println("Ingrese la cantidad de elementos por lado: ");
        elements = read.nextInt();

        for (int i = 0; i < elements; i++) {
            
            for (int j = 0; j < elements; j++) {
                
                if (i == 0 || i == (elements - 1)) {
                    System.out.print("*");
                } else if (j == 0 || j == (elements - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
