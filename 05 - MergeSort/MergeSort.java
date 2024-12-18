public class MergeSort {
    public static void main(String[] args) {
        
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