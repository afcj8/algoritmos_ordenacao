public class MergeSort {
    public static void main(String[] args) {
        
    }

    // Método: mergeSort

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int meio = arr.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[arr.length - meio];

        for (int i = 0; i < meio; i++) {
            esquerda[i] = arr[i];
        }

        for (int i = meio; i < arr.length; i++) {
            direita[i - meio] = arr[i];
        }

        mergeSort(esquerda);
        mergeSort(direita);
        merge(esquerda, direita, arr);
    }

    // Método: merge

    public static void merge(int[] esquerda, int[] direita, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] < direita[j]) {
                arr[k] = esquerda[i];
                i++;
            } else {
                arr[k] = direita[j];
                j++;
            }
            k++;
        }

        while (i < esquerda.length) {
            arr[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < direita.length) {
            arr[k] = direita[j];
            j++;
            k++;
        }
    }
}