
package guia_5;

import java.util.Scanner;

/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura de 
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123 
* 
* @author Sofi
*/

public class Extra12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int altura;
        int num = 2;
        String acumulador="1";
        String digito;

        System.out.println("Ingrese la altura deseada para la escalera:");
        altura = read.nextInt();
        for (int i = 0; i < altura; i++) {
            if (i==0){
                System.out.println(acumulador );
            } else {
                System.out.println(acumulador  + num);
                digito = String.valueOf(num);
                acumulador  = acumulador  + digito;
                num++;
            }
        }

    }

}

