/* 
Crear un programa en Java que permita registrar el ingreso económico de las n personas en un arreglo de
datos. Visualizar ingreso promedio, ingreso mayor de las personas.
 */
package programas;
import java.util.Scanner;
public class Ejercicio2 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();
        //  arreglo para los ingresos
        double[] ingresos = new double[n];
        double suma = 0;
        double ingresoMayor = 0;
        // proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso economico de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            suma += ingresos[i];  
            // ingreso mayor
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        //  ingreso promedio
        double promedio = suma / n;
        // salida de datos
        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
    }
}
