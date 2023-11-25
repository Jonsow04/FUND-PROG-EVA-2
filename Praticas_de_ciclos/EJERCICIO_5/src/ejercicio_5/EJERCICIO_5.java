
package ejercicio_5;

import java.util.Scanner;

public class EJERCICIO_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, r = 1;
        
        System.out.println("Introduce un número: ");
        num1 = input.nextInt();
        System.out.println("Introduce el exponente: ");
        num2 = input.nextInt();
        
        for (int i = 1; i <= num2; i++) {
            r *= num1;
            
        }
        System.out.println("Resultado: " + r);
    }
}
