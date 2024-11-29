public class QuickSort {
    public static void main(String[] args) {

    }

    // Método: QuickSort

    public static int separar(int[] arr, int inicio, int fim) {
        int pivo = arr[inicio];
        int i = inicio + 1;
        int f = fim;
        while (i <= f) {
            if (arr[i] <= pivo) {
                i++;
            } else if (pivo < arr[f]) {
                f--;
            } else {
                int troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
            }
        }
        arr[inicio] = arr[f];
        arr[f] = pivo;
        return f;
    }
}