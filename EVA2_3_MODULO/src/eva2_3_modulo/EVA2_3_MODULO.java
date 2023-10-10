
package eva2_3_modulo;
import java.util.Scanner;

public class EVA2_3_MODULO {

    public static void main(String[] args) {
        int x, r;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        
        x = input.nextInt();
        
        r = x % 2;
        
        if(r == 0){
            System.out.println("El número " + x + " es par.");
        }else{
            System.out.println("El número " + x + " es impar.");
        }
        
    }
    
}
