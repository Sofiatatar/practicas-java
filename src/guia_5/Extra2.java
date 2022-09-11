
package guia_5;

import java.util.Scanner;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
variable auxiliar
 */
public class Extra2 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int A = 2;
        int B = 4;
        int C = 6;
        int D = 8;
        int aux = B;
        
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.print("Los valores iniciales son: A = 2, B = 4, C = 6, D = 8" 
                + "\n" + "los valores invertidos son: A =" + A + ", B ="+ B 
                + ", C=" + C + ", D= " + D);
        
    }
}
