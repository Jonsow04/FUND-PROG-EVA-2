
package ejercicio_3;
import java.util.Scanner;


public class EJERCICIO_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, cont = 0;
        
        System.out.println("Introduce un número: ");
        num1 = input.nextInt();
        
        for (int i = 1; i <= num1; i++) {
            cont = cont + i;
        }
        System.out.println("Sumatoria final: " + cont);
    }
    
}
