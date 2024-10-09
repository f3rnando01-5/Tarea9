/*
Crear un programa en Java que permita registrar el peso de las n personas en un arreglo de datos. 
Visualizar el peso promedio de las personas. 
 */
package programas;
import java.util.Scanner;
public class Ejercicio1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();
        //  arreglo para los pesos
        double[] pesos = new double[n];
        double suma = 0;
        // proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso " + (i + 1) + " en kilogramos: ");
            pesos[i] = scanner.nextDouble();
            suma += pesos[i];    }
        double promedio = suma / n;
        // salida de datos
        System.out.println("El peso promedio es: " + promedio + " kg");
    }
}
 