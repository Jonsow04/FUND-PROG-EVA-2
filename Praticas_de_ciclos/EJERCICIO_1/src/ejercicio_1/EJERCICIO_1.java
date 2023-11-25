
package ejercicio_1;
import java.util.Scanner;


public class EJERCICIO_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduce el primer valor: ");
        num1 = input.nextInt();
        System.out.println("Introduce el segundo valor: ");
        num2 = input.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " - ");
        }
            
    }
    
}
