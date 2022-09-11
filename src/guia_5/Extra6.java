
package guia_5;

import java.util.Scanner;

/**
 Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Extra6 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int cantPersonas;
        float alturaIndividual;
        float alturaGeneral=0;
        float alturaPorDebajo=0;
        int cantPersonasPorDebajo=0;
        
        System.out.println("Ingrese la cantidad de personas que desea promediar: ");
        cantPersonas = read.nextInt();
        
        for (int i = 0; i < cantPersonas; i++) {
            
            System.out.println("Ingrese la altura de la persona N°" + (i+1));
            alturaIndividual= read.nextFloat();
            alturaGeneral+= alturaIndividual;
            
            if(alturaIndividual<1.60){
                cantPersonasPorDebajo++;
                alturaPorDebajo+=alturaIndividual;
            }
        }
        
        if(cantPersonasPorDebajo==0){
            
            System.out.println("El promedio de estatura general es de: " 
                + (alturaGeneral/cantPersonas)+ ". No se ingreasaron personas con"
                        + " una estatura inferior a 1.60mts");           
        }else{
        System.out.println("El promedio de estatura general es de: " 
                + (alturaGeneral/cantPersonas)+ " y el promedio de estatura por "
                + "debajo de 1.60mts es de: " + (alturaPorDebajo/cantPersonasPorDebajo));
        }
    }    
}
