
package eva2_11_tallas;
import java.util.Scanner;


public class EVA2_11_TALLAS {

    public static void main(String[] args) {
        int talla;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una talla. ");
        talla = input.nextInt();
        
        if(talla == 29){
            System.out.println("Small");
        }else if(talla == 42){
            System.out.println("Medium.");
        }else if(talla == 44){
            System.out.println("Large.");
        }else if(talla == 48){
            System.out.println("xLarge.");
        }else
            System.out.println("Talla desconocida.");  
    }
    
}
