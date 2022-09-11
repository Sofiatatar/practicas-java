package guia_5;

/* Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 € */

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double num;
        String currency;
        
        System.out.println("Ingrese la cantidad de Euros que desea convertir:");
        num = read.nextFloat();

        System.out.println("Ingrese el tipo de moneda a la que desea convertir: \n -Dolares. \n -Yenes. \n -Libras.");
        currency = read.next();
        currency = currency.toUpperCase();

        converter(num, currency);//llamado a funcion.
    }

    public static void converter(double num, String currency) {
        
        double conver = 0;
       
        switch (currency) {
            
            case "DOLARES":
                conver = (num * 1.28611);
                break;
            case "YENES":
                conver = (num * 129.852);
                break;
            case "LIBRAS":
                conver = (num * 0.86);
                break;
        }
        System.out.println(num + " Euros equivalen a: " + conver + " " + currency + ".");
    }

}
