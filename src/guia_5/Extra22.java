
package guia_5;

import java.util.Scanner;

/*
 Realizar un programa que complete un vector con los N primeros números de la 
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de 
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por 
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que 
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor
 */
public class Extra22 {

    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        int n;
        int [] serieFibonnaci;

        System.out.println("Ingrese la cantidad -N- de valores que desea "
                + "visualizar de la serie de Fibonnaci:");
        n = read.nextInt();
        serieFibonnaci= new int[n];
        sucesionFibonnaci(n, serieFibonnaci);
        
        System.out.println("Los "+n+" primero valores de la secuencia de Fibonnaci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(serieFibonnaci[i]+",");
        }

    }

    public static int[] sucesionFibonnaci(int n, int[] serieFibonnaci) {

        int numero1 = 0;
        int numero2 = 1;
        int numero3;

        for (int i = 0; i < n; i++) {

            numero3 = numero1 + numero2;
            serieFibonnaci[i]= numero3;
            numero1 = numero2;
            numero2 = numero3;
        }
        System.out.println("");
        
        return serieFibonnaci;
    }
}
