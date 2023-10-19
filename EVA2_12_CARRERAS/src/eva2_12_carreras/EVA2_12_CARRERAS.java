
package eva2_12_carreras;

import java.util.Scanner;

public class EVA2_12_CARRERAS {

    public static void main(String[] args) {
        String carrera; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una carrera.");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Carreras disponibles: ISC, INF, IND, IDI, LA, IGE y ARQ.");
        System.out.println("----------------------------------------------------------------");
        carrera = input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("INGENIERÍA EN SISTEMAS COMPUTACIONALES.");
                break;
            case "INF":
                System.out.println("INFORMÁTICA.");
                break;
            case "IND":
                System.out.println("");
                break;
            case "IDI":
                System.out.println("");
                break;
            case "LA":
                System.out.println("");
                break;
            case "IGE":
                System.out.println("");
                break;
            case "ARQ":
                System.out.println("ARQUITECTURA.");
                break;
        }
    }
    
}
