
package guia_5;

import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe 
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para 
realizar este ejercicio investigue como utilizar la función Math.random() de Java
 */

public class Extra10 {

    public static void main(String[] args) {

       Scanner read = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int result = number1 * number2;
        int answer;
        boolean correct;

        System.out.println("Teniendo en cuenta que A y B son dos números "
                + "entre 0 y 10, adivine cuál sería el resultado de multiplicar "
                + "ambos valores:");

        do {
            System.out.println("Respuesta:");
            answer = read.nextInt();

            if (answer == result) {
                System.out.println("Felicidades! Adivinaste la respuesta! "
                        + "Los números eran A: "+number1+ " y B: "+number2+".");
                correct = true;
            } else {
                System.out.println("La respuesta no es correcta! Podes volver "
                        + "a intentar! Ingresa otro valor:");
                correct = false;
            }
        } while (correct == false);
    }
}
