
package eva2_31_for_each;

public class EVA2_31_FOR_EACH {

    public static void main(String[] args) {
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        //FOR EACH --> FOR especial para arreglos
        //Solo funciona para la lectura de arreglos
        for (int valor : array) {
            System.out.println("[" + valor + "]");
        }
        
        String cadenas[] = new String[5];
        cadenas[0] = "Hola ";
        cadenas[1] = "mundo ";
        cadenas[2] = "inundado ";
        cadenas[3] = "de ";
        cadenas[4] = "miseria.";
        
        for(String cade: cadenas){
            System.out.print(cade);
        }
    }
    
}
