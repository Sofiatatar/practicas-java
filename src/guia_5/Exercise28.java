package guia_5;

import java.util.*;

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P.*/


public class Exercise28 {

    public static void main(String[] args) {
        
//        Scanner read = new Scanner(System.in);
//        Scanner read2 = new Scanner(System.in);

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int valuei, valuej;
        boolean detected = true;

        //LLENAR MATRIZ M (OK)
        System.out.println("La Matriz M es:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * (50 - 10) + 10);
            }
        }
        
        // MOSTRAR MATRIZ M (OK) 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" [" + matrizM[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //LLENAR MATRIZ P (OK)
        System.out.println("La Matriz P es:");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int) (Math.random() * (50 - 10) + 10);
            }
        }
        
        //MOSTRAR MATRIZ P (OK)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matrizP[i][j] + "] ");
            }
            System.out.println("");
        }
        
        //Buscar MatrizP[0][0]   
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                if (i < 8 && j < 8) {
                    
                    if (matrizM[i][j] == matrizP[0][0]) {
                        detected = true;
                        valuei = i;
                        valuej = j;
                        search(matrizM, matrizP, valuei, valuej);
                    } 
                } else {
                 detected = false;
                }
            }
        }
            
        if (detected == false) {
            System.out.println("");
            System.out.println("No se ha encontado la -Matriz P- dentro de las submatrices de la -Matriz M-.");
        }
    }

    public static void search(int[][] matrizM, int[][] matrizP, int valuei, int valuej) {
        
        int[][] matrizE = new int[3][3];
        
        System.out.println("");
        System.out.println("Se encontró la matriz: ");
        
        //muestro sub-M encontrada (OK).
        for (int i = valuei; i < (valuei + 3); i++) {
            for (int j = valuej; j < (valuej + 3); j++) {
                System.out.print("  [" + matrizM[i][j] + "]  ");
            }
            System.out.println("");
        }
        
//almaceno matriz encontrada en matrizE:

        int cont1=valuei;
        int cont2=valuej;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizE[i][j] = matrizM[cont1][cont2];
                cont2++;
            }
            System.out.println("");
            cont2=valuej;
            cont1++;
        }
        
//comparo
        if (Arrays.equals(matrizE,matrizP)) {
            System.out.println("Se encontró la -Matriz P- dentro de la -Matriz M-.");
            System.out.println("El primer elemento de la matriz P comienza en la fila: " + valuei + " y en la columna: " + valuej + " de la Matriz M.");
        } else {
            System.out.println("La -submatriz de M- encontrada no coincide con la -Matriz P-.");
        }
    }
}
