package guia_5;

import java.util.Scanner;

/*Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas es el 
cociente. Por ejemplo: 50 / 13: 
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. */
public class Extra9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int dividendo;
        int divisor;
        int cociente = 0;
        int residuo=0;

        do {
            System.out.println("Ingrese el numero dividendo -mayor que 0-:");
            dividendo = read.nextInt();
        } while (dividendo == 0);

        do {
            System.out.println("Ingrese el numero divisor -mayor que 0-:");
            divisor = read.nextInt();
        } while (divisor == 0);

        if (dividendo > divisor) {

            while (dividendo > divisor) {

                residuo = dividendo - divisor;
                cociente++;
                dividendo = residuo;
            }
            
            System.out.println("El cociente de la operacion es: " + cociente
                    + " y el residuo: " + residuo);
        } else {
            System.out.println("No es posible divivir " + dividendo + " en "
                    + divisor + " ya que el dividendo es menor que el divisor."
                    + " El cociente de la operacion es " + cociente + " y el residuo: "
                    + dividendo);
        }
    }
}
