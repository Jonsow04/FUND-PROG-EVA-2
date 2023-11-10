
package eva2_24_arreglos_ciclos;


public class EVA2_24_ARREGLOS_CICLOS {

    public static void main(String[] args) {
        int[] arreglo = new int[1000000];
            //1er = 0, último = N - 1
        for (int i = 0; i < 1000000; i++) {
            arreglo[i] = 10000;
        }
        for (int i = 0; i < 1000000; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
