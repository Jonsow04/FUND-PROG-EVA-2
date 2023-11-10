
package eva2_25_arreglos;
import java.util.Scanner;


public class EVA2_25_ARREGLOS {

    public static void main(String[] args) {
        int ccal;
        int[] arrayCal;
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Cuántas calificaciones quieres capturar?");
        ccal = input.nextInt();
        
        arrayCal = new int[ccal];
        for (int i = 0; i < ccal; i++) {
            System.out.println("Introduce una califición: ");
            arrayCal[i] = input.nextInt();
        }
        for (int i = 0; i < ccal; i++) {
            System.out.print(arrayCal[i] + " - ");
        }
        
    }
    
}
