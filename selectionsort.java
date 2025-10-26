public class selectionsort {
    static void selectionSort(int tamanho, int[] vetor) {
        int temp, minIndex, troca = 0, iteracao = 0;
        long inicio = System.nanoTime();

        for (int i = 0;i < tamanho - 1;i++){
            minIndex = i;
            for (int j = i + 1;j < tamanho;j++) {
                iteracao++;
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                troca++;
            }
        }

        long fim = System.nanoTime();
        double tempoMs = (fim - inicio) / 1_000_000.0;

        System.out.println("Tempo de execução: " + tempoMs + " ms");
        System.out.println("Trocas: " + troca);
        System.out.println("Iterações: " + iteracao);
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        selectionSort(vetor1.length, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        selectionSort(vetor2.length, vetor2);

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        selectionSort(vetor3.length, vetor3);
    }
}
