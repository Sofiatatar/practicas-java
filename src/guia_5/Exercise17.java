package guia_5;

import java.util.Scanner;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

public class Exercise17 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String word;
        String FDE = "&&&&&";
        int correct = 0;
        int incorrect = 0;
        int wordLong;

        do {
            
            System.out.println("Ingrese una cadena para ser leída por el "
                    + "dispositivo RS232. Si desea finalizar el envío de datos "
                    + "ingrese '&&&&&'");
            word = read.nextLine();
            wordLong = word.length();

            if (word.equals(FDE)) {
                System.out.println("El envío de datos ha finalizado.");
                break;
            }

            if (wordLong <= 5) {
                if (word.substring(0, 1).equalsIgnoreCase("X") && word.substring(wordLong - 1, wordLong).equalsIgnoreCase("O")) {
                    correct++;
                    continue;
                }
            }
            incorrect++;     
        } while (!word.equals(FDE));

        System.out.println("Se realizaron: " + correct + " lecturas correctas.");
        System.out.println("Se realizaron: " + incorrect + " lecturas incorrectas.");
    }

}
