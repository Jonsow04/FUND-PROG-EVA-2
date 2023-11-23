
package eva2_29_arreglos_mdim_2;

public class EVA2_29_ARREGLOS_MDIM_2 {

    public static void main(String[] args) {
       int[][] matriz = new int[3][];
       //PODEMOS DEFINIR EL TAMAÑO DE CADA FILA
       matriz[0] = new int[10];
       matriz[1] = new int[5];
       matriz[2] = new int[3];
       
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
       
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
