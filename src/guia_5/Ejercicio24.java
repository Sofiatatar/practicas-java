/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package Guía_5_Java;

public class Ejercicio24 {
    public static void main(String[] args) {
        
        int tamañoVector= (int)(Math.random()* 100 + 1);   
        int [] vector = new int [tamañoVector];
        int cantDígitos;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        String dígitos;
        
        System.out.println("El tamaño del vector es de: "+ tamañoVector);
        
        for (int i = 0; i < tamañoVector; i++) {
            
          vector [i] = (int)(Math.random()*10000);
          dígitos= Integer.toString(vector[i]);
          cantDígitos= dígitos.length();
          
            switch (cantDígitos) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;                  
            }
        }
            
        System.out.println("Se contabilizaron: \n" + cont1 +
                " números de 1 dígito,\n"+ cont2 +" números de 2 dígitos,\n" 
                + cont3+ " números de 3 dígitos,\n" + cont4 +
                " números de 4 dígitos, \n" + cont5 + " números de 5 dígitos.");

    }
}
