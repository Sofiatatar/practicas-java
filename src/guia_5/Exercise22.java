
package guia_5;

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente*/


public class Exercise22 {

    public static void main(String[] args) {
       
        int tamaño= 100;
        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño ; i++) {
            vector[i] = i;          
        }
            
        for (int i = tamaño-1; i >0; i--) {
            System.out.println(vector[i]);
        }  
    }     
}
