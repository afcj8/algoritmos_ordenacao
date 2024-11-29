public class QuickSort {
    public static void main(String[] args) {

    }

    // Método: quickSort

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(arr, inicio, fim);
            quickSort(arr, inicio, posicaoPivo - 1);
            quickSort(arr, posicaoPivo + 1, fim);
        }
    }

    // Método: separar

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