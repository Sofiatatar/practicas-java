
package guia_5;

import java.util.Scanner;

/*Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 *
 * @author Sofi
 */
public class Extra16 {
    public static void main(String[] args) {
        
        Scanner read= new Scanner(System.in);
        int numero;
        Boolean validarPrimo;
        
        System.out.println("Ingrese el numero que desee validar:");
        numero=read.nextInt();
       
        validarPrimo= validarPrimo(numero);
        
        if (validarPrimo==true) {
            System.out.println("El numero indicado es PRIMO.");
        }else{
            System.out.println("El numero ingresado no es PRIMO");
        }
        
        
    }
    
    public static Boolean validarPrimo(int numero){
        
        int contador=0; 
        Boolean validacion = false;
        
        for (int i = 1; i < numero+1; i++) {
            
            if ((numero % i)==0) {
            contador++;
            }   
        }     
            
        if (contador==2) {
            validacion=true;          
        }
        
        return validacion;
    }    
}

