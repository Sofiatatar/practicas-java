
package Guía_5_Java;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
muestre ordenada por sus columnas.
 */

public class Ejercicio25 {
     public static void main(String[] args) {
        
        int[][] matriz = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j]= (int)(Math.random()*10+1);
                
            }            
        }
        
        //matriz original:
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                  System.out.print("["+matriz[i][j]+"]" + "\t");
             }
             System.out.println("\n");
         }
        
         System.out.println("\n");
         
        //matriz ordenada por columnas:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]" + "\t");              
            }
            System.out.println("\n");    
        }
    }
}
