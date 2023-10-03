
package eva2_2_if;
import java.util.Scanner;

public class EVA2_2_IF {

    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificación:");
        califa = input.nextInt();
        
        if (califa >= 70) { //Esto se ejecuta si es verdad
            System.out.println("Wuuuuu aprobaste, sacaste UN " + califa);
        }else{ //Esto se ejecuta si es falso. El "else" es opcional
            System.out.println("Noooo tas bien tonto a la bestia, sacaste un triste " + califa);
        }
    }
    
}
