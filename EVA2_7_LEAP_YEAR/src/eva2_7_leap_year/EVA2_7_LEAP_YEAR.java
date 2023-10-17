
package eva2_7_leap_year;
import java.util.Scanner;

public class EVA2_7_LEAP_YEAR {

    public static void main(String[] args) {
        int year, res4, res100, res400;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año: ");
        year = input.nextInt();
        
        res4 = year % 4;
        res100 = year % 100;
        res400 = year % 400;
        
        if((res4 == 0) && ((res100 != 0) || (res400 == 0))){
            System.out.println("El año "+ year + " es año bisiesto.");
        }else
            System.out.println("El año "+ year + " no año bisiesto.");
        
    }
    
}
