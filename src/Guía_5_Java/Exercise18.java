package Guía_5_Java;

import java.util.Scanner;

/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E*/

public class Exercise18 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        String char1;
        String char2; 
        String char3;

        for (int i = 0; i < 10; i++) {
            
            char1 = Integer.toString(i);
            
            if (char1.equals("3")) {
                char1 = "E";
            }
            
            for (int j = 0; j < 10; j++) {
                
                char2 = Integer.toString(j);
                
                if (char2.equals("3")) {
                    char2 = "E";
                }
                
                for (int k = 0; k < 10; k++) {
                    char3 = Integer.toString(k);
                    
                    if (char3.equals("3")) {
                        char3 = "E";
                    }
                    System.out.println(char1 + "-" + char2 + "-" + char3);
                }
            }
        }
    }
}
