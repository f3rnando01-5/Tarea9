/*
Crear un programa en Java que permita registrar las compras de los n personas en un arreglo de datos.
Visualizar el total, promedio y compra mayor y menor.
 */
package programas;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ingreso de datos
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();
        // arreglo para las compras
        double[] compras = new double[n];
        double suma = 0;
        double compraMayor = 0;
        double compraMenor = Double.MAX_VALUE;
        // proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            suma += compras[i];  
            //  la compra mayor
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            // la compra menor
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        // promedio de compras
        double promedio = suma / n;
        // salida de datos
        System.out.println("El total de las compras es: " + suma);
        System.out.println("El promedio de las compras es: " + promedio);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }

}
