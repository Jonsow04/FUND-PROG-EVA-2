
package eva2_3_annio_bisiesto;
import java.util.Scanner;

public class EVA2_3_ANNIO_BISIESTO {

    public static void main(String[] args) {
        int year, r;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un año:");
        
        year = input.nextInt();
        r = year % 4;
        
        if(r  == 0){
            r = year % 100;
            if(r == 0){
                r = year % 400;
                if(r == 0){
                    System.out.println("Es año bisiesto. wuuuuuuu");
                }else
                    System.out.println("No es año bisiesto.");
            }else
                System.out.println("Es año bisiesto. wuuuuuuuuu");
        }else
            System.out.println("No es año bisiesto.");
        
    }
    
}
