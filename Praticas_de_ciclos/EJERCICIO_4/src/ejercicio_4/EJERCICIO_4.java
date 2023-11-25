
package ejercicio_4;

import java.util.Scanner;


public class EJERCICIO_4 {

    public static void main(String[] args) {
        int num, quest;
        
        do {            
            Scanner input = new  Scanner(System.in);
            System.out.println("Introduce un número: ");
            num = input.nextInt();
            
            if(num > 0){
                System.out.println("El número " + num + " es positivo.");
            }else if(num < 0){
                System.out.println("El número " + num + " es negativo.");
            }else
                System.out.println("El número es cero.");
            System.out.println("---------------------------------------------");
            System.out.println("¿Quieres repetir el programa? (SI = 1, NO = 0)");
            quest = input.nextInt();
        } while (quest == 1);
    } 
}
