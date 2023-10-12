
package eva2_5_operaciones;
import java.util.Scanner;
import java.lang.Math;

public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        //Declaración de variables
        double x1, x2, suma, resta, mult, div;
        Scanner input = new Scanner(System.in);
        
        //Introducción de datos
        System.out.println("Introduce 2 valores:");
        System.out.println("Primero valor:");
        x1 = input.nextDouble();
        System.out.println("Introduce el segundo valor:");
        x2 = input.nextDouble();
        
        //Suma
        suma = x1 + x2;
        //Resta
        resta = x1 - x2;
        //Multiplicación
        mult = x1 * x2;
        //División
        div = x1 / x2;
        System.out.println("-------------------------------------------------");
        //Muestreo de resultados
        System.out.println("La suma de x1 y x2 es = " + suma);
        System.out.println("La resta de x1 y x2 es = " + resta);
        System.out.println("La multiplicación de x1 y x2 es = " + mult);
        System.out.println("La división de x1 y x2 es = " + div);
        
        //Precedencia de operaciones
        int a = 5, b = 4, c = 3;
        int r = (a * b) + (a - c) * (b - a); //(20) + (2) * (-1) = 18
        System.out.println("Resultado precedencia: " + r);
        
        //Potencias y raices
        double p;
        p = Math.pow(5, 3);
        System.out.println("Potencia = " + p);
    
    }
    
}
