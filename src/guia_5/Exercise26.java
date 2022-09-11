package guia_5;

import java.util.Scanner;

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa).*/

public class Exercise26 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        int cont = 0;
        
        System.out.println("Ingrese un tamaño para la matriz:");
        n = leer.nextInt();
        
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        
        //matriz A
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        
        //matriz B
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
        
        //Comparación
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrizB[i][j] == (-(matrizA[i][j]))) {
                    cont++;
                }
            }
        }
        
        if (cont == (n * n)) {
            System.out.println("La matriz es anti simétrica.");
        } else {
            System.out.println("La matriz no es anti simétrica.");
        }

    }
}
