package guia_5;

import java.util.Scanner;

/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

*/

public class Exercise20 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num;
        int aux = 0;

        System.out.println("Ingrese cuatro números enteros separados por espacio (comprendidos entre 1 y 20)");
        
        do {
            num = read.nextInt();
            System.out.print(num);

            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            
            System.out.println(" ");
            aux++;
            
        } while (aux < 4);
    }
}