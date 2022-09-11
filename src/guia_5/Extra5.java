package guia_5;

import java.util.Scanner;

/*Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio.*/

public class Extra5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String tipoDeSocio;
        double importeAAbonar = 0;
        double costoDelTratamiento;

        System.out.println("Ingrese la categoria del socio:");
        tipoDeSocio = read.next();
        System.out.println("Ingrese el costo del tratamiento a realizar:");
        costoDelTratamiento = read.nextDouble();

        switch (tipoDeSocio) {
            case "A":
                importeAAbonar = (costoDelTratamiento * 0.50);
                break;
            case "B":
                importeAAbonar = (costoDelTratamiento * 0.35);
                break;
            case "C":
                importeAAbonar = costoDelTratamiento;
                break;
            default:
                System.out.println("Se ingresó un tipo de socio incorrecto.");
        }

        System.out.println("El socio perteneciente a la categoria: "
                + tipoDeSocio + " deberá abonar $" + importeAAbonar
                + " del tratamiento que tiene un valor de $" + costoDelTratamiento);
    }
}
