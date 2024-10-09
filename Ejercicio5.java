/*
.- Crear un programa en Java que permita almacenar cinco números en el arreglo  
          a y b. Visualizar los valores del arreglo a y b en forma intercalada al arreglo c.
 */
package programas;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        // Definir los arreglos a y b con cinco números cada uno
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};

        // Definir el arreglo c con el doble de tamaño (para intercalar los valores de a y b)
        int[] c = new int[a.length + b.length];

        // Llenar el arreglo c intercalando los valores de a y b
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];  // Insertar valor de a
            c[index++] = b[i];  // Insertar valor de b
        }

        // Mostrar los valores intercalados del arreglo c
        System.out.println("Arreglo c con valores intercalados:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

