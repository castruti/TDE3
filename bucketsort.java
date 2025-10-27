public class bucketsort {
    static void bucketSort(int tamanho, int[] vetor) {
        int trocas = 0, iteracoes = 0;
        long inicio = System.nanoTime();

        int menor = vetor[0];
        int maior = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            iteracoes++;
            if (vetor[i] < menor) menor = vetor[i];
            if (vetor[i] > maior) maior = vetor[i];
        }

        int qtdBaldes = 5;
        int[][] baldes = new int[qtdBaldes][tamanho];
        int[] contadores = new int[qtdBaldes];

        for (int i = 0; i < qtdBaldes; i++) contadores[i] = 0;

        int intervalo = (maior - menor) / qtdBaldes + 1;
        for (int i = 0; i < tamanho; i++) {
            iteracoes++;
            int indice = (vetor[i] - menor) / intervalo;
            if (indice >= qtdBaldes) indice = qtdBaldes - 1;
            baldes[indice][contadores[indice]] = vetor[i];
            contadores[indice]++;
        }

        for (int i = 0; i < qtdBaldes; i++) {
            for (int j = 0; j < contadores[i] - 1; j++) {
                for (int k = 0; k < contadores[i] - j - 1; k++) {
                    iteracoes++;
                    if (baldes[i][k] > baldes[i][k + 1]) {
                        int temp = baldes[i][k];
                        baldes[i][k] = baldes[i][k + 1];
                        baldes[i][k + 1] = temp;
                        trocas++;
                    }
                }
            }
        }

        int pos = 0;
        for (int i = 0; i < qtdBaldes; i++) {
            for (int j = 0; j < contadores[i]; j++) {
                vetor[pos++] = baldes[i][j];
            }
        }

        long fim = System.nanoTime();
        double tempoMs = (fim - inicio) / 1_000_000.0;

        System.out.println("Tempo de execução: " + tempoMs + " ms");
        System.out.println("Trocas: " + trocas);
        System.out.println("Iterações: " + iteracoes);
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        bucketSort(vetor1.length, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        bucketSort(vetor2.length, vetor2);

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        bucketSort(vetor3.length, vetor3);
    }
}
