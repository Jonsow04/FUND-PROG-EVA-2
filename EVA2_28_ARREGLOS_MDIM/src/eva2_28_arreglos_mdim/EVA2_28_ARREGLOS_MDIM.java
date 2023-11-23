
package eva2_28_arreglos_mdim;

public class EVA2_28_ARREGLOS_MDIM {

    public static void main(String[] args) {
        int[][] matriz = new int[5][10];
        
        matriz[1][5] = 100;
        
        System.out.println(matriz[1][3]);
        System.out.println(matriz.length);
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
