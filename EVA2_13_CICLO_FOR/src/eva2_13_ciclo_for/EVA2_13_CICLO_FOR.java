
package eva2_13_ciclo_for;
import java.util.Scanner;

public class EVA2_13_CICLO_FOR {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("");
        for (int i = 9; i > -1; i--) {
            System.out.println(i);
        }
        System.out.println("");
        for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);
        }
        
    }
    
}
