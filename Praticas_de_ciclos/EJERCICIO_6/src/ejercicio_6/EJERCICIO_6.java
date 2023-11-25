
package ejercicio_6;

import java.util.Scanner;

public class EJERCICIO_6 {
    //incompleto
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número: ");
        n = input.nextInt();
        double[] dec = {8000};
        double bin = 0;
        
        for(int i = 0; i < dec.length; i++) {
            bin = dec[i] % 2;
        }
        System.out.println(bin);
    }
    
}
