
package eva2_19_validar_usuario;

import java.util.Scanner;

public class EVA2_19_VALIDAR_USUARIO {
    final static String NOMBRE_USUARIO = "JonSnow";
    final static String PASSWORD = "Garra";

    public static void main(String[] args) {
        String usuario, password;
        Scanner input = new Scanner(System.in);        
        
        do{
            System.out.println("Introduce nombre de usuario: ");
            usuario = input.nextLine();
            System.out.println("Introduce la contraseña: ");
            password = input.nextLine();
        }while((!usuario.equals(NOMBRE_USUARIO)) || (!password.equals(PASSWORD)));
        System.out.println("Sesión iniciada.");
    }   
    
}
