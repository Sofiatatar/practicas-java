package guia_5;

import java.util.Scanner;

/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.*/


public class Extra7 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int cantNumeros;
        float numero;
        float sumaNumeros=0;
        int contador=0;
        float promedio;
        
        System.out.println("Ingrese la cantidad de números que desea promediar: ");
        cantNumeros= read.nextInt();
        
        while(contador<cantNumeros){
            System.out.println("Ingrese el numero a promediar");
            numero= read.nextInt();
            sumaNumeros+=numero;
            contador++;
        }
        
        promedio= (sumaNumeros/cantNumeros);
        
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
    }
}
