
package eva2_27_busqueda_arreglos;

import java.util.Scanner;

public class EVA2_27_BUSQUEDA_ARREGLOS {

    public static void main(String[] args) {
        // CREAR UN ARREGLO DE 15 ELEMENTOS.
        // LLENARLO CON VALORES ALEATORIOS.
        int[] array= new int[15];
        // LLENARLO CON VALORES ALEATORIOS ENTRE 0 Y 99.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("¿Qué número buscas?");
        num = input.nextInt();
        // BÚSQUEDA SECUENCIAL (POR FUERZA BRUTA)
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num)
                System.out.println("Número " + num + " encontrado en la posición " + i + ".");
            break;
        }
    }
    
}
