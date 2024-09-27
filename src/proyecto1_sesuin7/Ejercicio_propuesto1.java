
package proyecto1_sesuin7;

import java.util.Scanner;
public class Ejercicio_propuesto1 {
public static void main(String[] args) {
        // Declarar variables
        String nombre, mejoralum = "", opc = "";
        int nota, n1, n2, n3, i = 0;
        double prom = 0, promax = 0;
        Scanner lectura = new Scanner(System.in);

        // Proceso de datos
        do {
            System.out.print("Ingrese el nombre del " + (i + 1) + "° alumno: ");
            nombre = lectura.next(); // Captura el nombre del alumno
            System.out.print("Ingrese la nota 1: ");
            n1 = lectura.nextInt(); // Captura la primera nota
            System.out.print("Ingrese la nota 2: ");
            n2 = lectura.nextInt(); // Captura la segunda nota
            System.out.print("Ingrese la nota 3: ");
            n3 = lectura.nextInt(); // Captura la tercera nota

            // Calcular el promedio
            prom = (n1 + n2 + n3) / 3.0; // Promedio de las tres notas
            System.out.println("El promedio es " + prom);

            // Verificar si este alumno tiene el mayor promedio
            if (prom > promax) {
                promax = prom;
                mejoralum = nombre;
            }

            System.out.print("¿Desea continuar? [S o N]: ");
            opc = lectura.next();
            i++; // Incrementa el contador de alumnos

        } while (opc.equalsIgnoreCase("S")); // Permitir 's' o 'S'

        // Salida de datos
        System.out.println("-----------------------------------");
        System.out.println(mejoralum + " tiene el mayor promedio");
        System.out.println("Obtuvo: " + promax);
        System.out.println("-----------------------------------");
       
    }
}