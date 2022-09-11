package guia_5;

import java.util.*;

/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java*/

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres:");
        frase = lector.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("La frase ingresada es CORRECTA, posee 8 carácteres.");
        } else {
            System.out.println("La frase ingresada es INCORRECTA, no posee ocho carácteres.");
        }
    }
}
