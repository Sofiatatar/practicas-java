
package guia_5;

/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos.
*
 * @author Sofi
 */
public class Extra20 {
    public static void main(String[] args) {
        
        int n= (int)(Math.random()*20);
        int m= (int)(Math.random()*20);
        int[][] matriz1 = new int[n][m];
        int suma=0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz1[i][j]= (int)(Math.random()*20);
                suma+=matriz1[i][j];
            }
        }
        
        System.out.println("La matriz a sumar es:");
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("La suma de los elementos que conforman la matriz es: "+suma);
    }
    
}
