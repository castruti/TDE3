public class gnomesort {
    static void gnomeSort(int tamanho, int[] vetor) {
        int i = 0, troca = 0, iteracao = 0;
        long inicio = System.nanoTime();

        while (i < tamanho) {
            if (i == 0 || vetor[i] >= vetor[i - 1]) {
                i++;
            } else {
                int temp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = temp;
                troca++;
                i--;
            }
            iteracao++;
        }

        long fim = System.nanoTime();
        double tempoMs = (fim - inicio) / 1_000_000.0;

        System.out.println("Tempo de execução: " + tempoMs + " ms");
        System.out.println("Trocas: " + troca);
        System.out.println("Iterações: " + iteracao);
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        gnomeSort(vetor1.length, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        gnomeSort(vetor2.length, vetor2);

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        gnomeSort(vetor3.length, vetor3);
    }
}
