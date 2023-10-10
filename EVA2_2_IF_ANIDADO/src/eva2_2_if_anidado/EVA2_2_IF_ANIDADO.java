
package eva2_2_if_anidado;
import java.util.Scanner;

public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
        int valor1, valor2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Valor 1:");
        valor1 = input.nextInt();
        System.out.println("Valor 2: ");
        valor2 = input.nextInt();    
        
        if(valor1 > valor2){
            System.out.println("El valor mayor es: " + valor1);
        }else{
            if(valor1 == valor2){
                System.out.println("Ambos valores son iguales. Valor 1: " + valor1 + ", valor 2: " + valor2);
            }else{
                System.out.println("El valor mas pequeño es: " + valor1);
            }
        }
    }
    
}
