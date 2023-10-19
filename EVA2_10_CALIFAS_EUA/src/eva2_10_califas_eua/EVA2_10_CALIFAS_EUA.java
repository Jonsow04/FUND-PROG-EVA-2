
package eva2_10_califas_eua;
import java.util.Scanner;

public class EVA2_10_CALIFAS_EUA {

    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una calificación: ");
        califa = input.nextInt();
        
        if((califa >= 90) && (califa <= 100)){
            System.out.println("Calificación: A");
        }else if((califa >= 80) && (califa <= 89)){
            System.out.println("Calificación: B");
        }else if((califa >= 70) && (califa <= 79)){
            System.out.println("Calificación: C"); 
        }else if((califa >= 60) && (califa <= 69)){
            System.out.println("Calificación: D");  
        }else if((califa < 60) && (califa >= 0)){
            System.out.println("Calificación: F");
        }else if ((califa < 0) || (califa >100)){
            System.out.println("Introduce una calificación válida.");
        }
    }
    
}
