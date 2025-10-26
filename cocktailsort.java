public class cocktailsort {
    static void cocktailSort(int tamanho, int[] vetor) {
        int temp, troca = 0, iteracao = 0, inicio = 0, fim = tamanho - 1;
        boolean trocou = true;
        long tempoInicio = System.nanoTime();

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                iteracao++;
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    troca++;
                    trocou = true;
                }
            }

            if (!trocou)
                break;

            fim--;

            trocou = false;

            for (int i = fim - 1; i >= inicio; i--) {
                iteracao++;
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    troca++;
                    trocou = true;
                }
            }

            inicio++;
        }

        long tempoFim = System.nanoTime();
        double tempoMs = (tempoFim - tempoInicio) / 1_000_000.0;

        System.out.println("Tempo de execução: " + tempoMs + " ms");
        System.out.println("Trocas: " + troca);
        System.out.println("Iterações: " + iteracao);
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        cocktailSort(vetor1.length, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        cocktailSort(vetor2.length, vetor2);

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        cocktailSort(vetor3.length, vetor3);
    }
}
