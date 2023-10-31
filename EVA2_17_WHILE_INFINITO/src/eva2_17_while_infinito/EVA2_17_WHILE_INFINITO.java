
package eva2_17_while_infinito;
import java.util.Scanner;

public class EVA2_17_WHILE_INFINITO {

    public static void main(String[] args) {
        int valor = 100;
        Scanner input = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Introduce el número que piensas es el correcto.");
            int num = input.nextInt();
            if(num == valor){
                System.out.println("¡Adivinaste!");
                break;//Aquí termina el while
            }    
        }
    }
    
}
