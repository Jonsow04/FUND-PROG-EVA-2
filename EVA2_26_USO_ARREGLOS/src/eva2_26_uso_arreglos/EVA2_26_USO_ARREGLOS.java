
package eva2_26_uso_arreglos;

import java.util.Scanner;

public class EVA2_26_USO_ARREGLOS {

    public static void main(String[] args) {
        String[] platillos = new String[10];
        platillos[0] = "Tacos de bistec";
        platillos[1] = "Montados";
        platillos[2] = "Chilaquiles";
        platillos[3] = "Gorditas";
        platillos[4] = "Quesadillas";
        platillos[5] = "Burritos";
        platillos[6] = "Frijolitos";
        platillos[7] = "Caldo de res";
        platillos[8] = "Menudo";
        platillos[9] = "Tostadas";
        double[] precio = {59.99, 49.99, 79.99, 24.99, 29.99, 26.99, 44.44, 89.99, 74.99, 39.99};
        
        System.out.println("------------Menú------------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + " - " + platillos[i] + ": $" + precio[i]);
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Qué quieres pedir el menú?");
        opc = input.nextInt();
        System.out.println("¿Cuántas ordenes quieres?");
        cant = input.nextInt();
        
        System.out.println("El total de tu pedido es: $" + (cant * precio[opc]));
    }
    
}
