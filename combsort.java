public class combsort {
    static void combSort(int tamanho, int[] vetor) {
        int troca = 0, iteracao = 0, intervalo = tamanho;
        boolean trocou = true;
        double fator = 1.3;
        long inicio = System.nanoTime();

        while (intervalo > 1 || trocou) {
            intervalo = (int)(intervalo / fator);
            if (intervalo < 1){
                intervalo = 1;
            }
            trocou = false;

            for (int i = 0; i + intervalo < tamanho; i++) {
                if (vetor[i] > vetor[i + intervalo]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + intervalo];
                    vetor[i + intervalo] = temp;
                    troca++;
                    trocou = true;
                }
                iteracao++;
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
        combSort(20, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        combSort(20, vetor2);
        
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        combSort(20, vetor3);
    }
}
