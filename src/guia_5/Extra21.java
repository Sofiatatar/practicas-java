package guia_5;

import java.util.Random;
import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con un 
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras 
creada. 
 */
public class Extra21 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        String palabra;
        Boolean validacion;
        int contador = 1;

        do {
            System.out.println("Ingrese la " + contador + " palabra que desea ingresar "
                    + "a la sopa de letras. Debe tener entre 3 y 5 caracteres, "
                    + "el sistema validara si la palabra ingresada es correcta:");
            palabra = read.nextLine();
            validacion = validarPalabra(palabra);

            if (validacion) {
                contador++;
                ordenarPalabra(sopa, palabra);
            } else {
                System.out.println("La palabra no es correcta.");
            }
        } while (5 >=contador);

        rellenarVacios(sopa);
        mostrarSopa(sopa);

    }

    public static Boolean validarPalabra(String palabra) {

        Boolean validacion = false;

        if (palabra.length() >= 3 && palabra.length() <= 5) {
            validacion = true;
            System.out.println("La palabra es correcta. Se agregara a la sopa de letras");
        }
        return validacion;
    }

    public static String[][] ordenarPalabra(String[][] sopa, String palabra) {

        int fila = 0;
        int columna = 0;
         
        do {
            fila = (int) (Math.random() * 20);
            columna = (int) (Math.random() * (20 - palabra.length()));
        } while (sopa[fila][columna] != null);

            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][columna+i]=""+palabra.charAt(i);
            }                  
        return sopa;
    }

    public static void rellenarVacios(String[][] sopa) {
        
        Random random= new Random();
        
        for (String[] sopa1 : sopa) {
            for (int j = 0; j < sopa1.length; j++) {
                if (sopa1[j] == null) {
                    sopa1[j] = ""+ ((char) (random.nextInt(26) + 'a'));
                }
            }
        }
    }

    public static void mostrarSopa(String[][] sopa) {
        System.out.println("La sopa de letras formada es: ");

        for (String[] sopa1 : sopa) {
            for (String item : sopa1) {
                System.out.print("[" + item + "]");
            }
            System.out.println("");
        }
    }
}
