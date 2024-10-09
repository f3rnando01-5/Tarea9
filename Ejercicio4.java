/*
Crear un programa en Java que permita almacenar en un arreglo de datos cinco nombres de personas
ingresadas y realizar una búsqueda mediante un nombre ingresado. Visualizar un mensaje indicando
si la persona existe o no existe y la posición del número en el arreglo de datos.
 */
package programas;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ingreso de datos
        String[] nombres = new String[5];
        System.out.println("Ingrese los nombres de cinco personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();  }
        // proceso de datos
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;  
            }
        }
        // salida de datos
        if (encontrado) {
            System.out.println("La persona " + nombreBuscado + " existe en la posicion " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}

