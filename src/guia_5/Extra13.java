
package guia_5;

import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de 
todas las familias.
 */

public class Extra13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int cantFamilias;
        int cantHijos;
        int sumaCantHijos=0;
        int sumaEdades=0;

        System.out.println("Ingrese la cantidad de familias:");
        cantFamilias = read.nextInt();
        
        for (int i = 0; i < cantFamilias; i++) {
            
            System.out.println("Ingrese el apellido de la familia:");
            String apellido = read.next();
            System.out.println("Ingrese la cantidad de hijos que tienen:");
            cantHijos = read.nextInt();
            sumaCantHijos+= cantHijos;
            
            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Ingrese la edad de los hijos:");
                sumaEdades+= read.nextInt();               
            }
            
            System.out.println("la familia "+ apellido + " tiene " + cantHijos + " hijos.");
            
        }
        
        System.out.println("La media de la edad de los hijos de todas las familias "
                + "ingresadas es: " +(sumaEdades/sumaCantHijos));

    }

}
