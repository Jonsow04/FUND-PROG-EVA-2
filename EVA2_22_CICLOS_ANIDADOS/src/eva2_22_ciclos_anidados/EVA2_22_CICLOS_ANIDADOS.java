
package eva2_22_ciclos_anidados;

import java.util.Scanner;

public class EVA2_22_CICLOS_ANIDADOS {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Pon un número.");
        num = input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }   
    }
    
}
