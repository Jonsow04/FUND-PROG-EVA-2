
package eva2_18_do_while;

import java.util.Scanner;

public class EVA2_18_DO_WHILE {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
            
        do{//Este bloque siempre se va a ejecutar una vez
            System.out.println("Intenta adivinar el número.");
            num = input.nextInt();
        }while(num != 100);
        System.out.println("¡Adivinaste!");
        
    }
    
}
