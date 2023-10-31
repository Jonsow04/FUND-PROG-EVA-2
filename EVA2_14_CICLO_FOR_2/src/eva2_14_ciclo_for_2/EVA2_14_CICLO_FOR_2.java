
package eva2_14_ciclo_for_2;
import java.util.Scanner;

public class EVA2_14_CICLO_FOR_2 {

    public static void main(String[] args) {
        int cont;
        double califa, contCa;
        califa = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el número de calificaciones: ");
        cont = input.nextInt();
        System.out.println("----------------------------------------------");
        
        for (int i = 1; i <= cont; i++) {
            System.out.println("Introduce la calificación " + i + ": ");
            contCa = input.nextDouble();
            califa = califa + contCa;
        }
        califa = califa / cont;
        System.out.println("Promedio de calificaciones: " + califa);
    } 
}
