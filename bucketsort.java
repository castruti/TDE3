import java.util.ArrayList;
import java.util.Collections;

public class bucketsort {
    static void bucketSort(int tamanho, int[] vetor) {
        int troca = 0, iteracao = 0;
        long inicio = System.nanoTime(); // tempo inicial

        // 1. Cria os buckets
        int numeroBuckets = 10; // você pode ajustar conforme necessário
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < numeroBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        // 2. Distribui os elementos nos buckets
        int max = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > max) max = vetor[i];
        }

        for (int i = 0; i < tamanho; i++) {
            iteracao++;
            int index = (int) ((vetor[i] * numeroBuckets) / (max + 1));
            buckets.get(index).add(vetor[i]);
        }

        // 3. Ordena cada bucket individualmente
        for (ArrayList<Integer> bucket : buckets) {
            iteracao += bucket.size(); // contar iterações internas
            Collections.sort(bucket);
        }

        // 4. Concatena os buckets de volta no vetor
        int k = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int num : bucket) {
                if (vetor[k] != num) troca++; // conta como troca se for diferente
                vetor[k++] = num;
            }
        }

        long fim = System.nanoTime(); // tempo final
        double tempoMs = (fim - inicio) / 1_000_000.0; // converte para ms
        System.out.println("Tempo de execução: " + tempoMs + " ms");
        System.out.println("Trocas: " + troca);
        System.out.println("Iterações: " + iteracao);
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        bucketSort(20, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        bucketSort(20, vetor2);

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        bucketSort(20, vetor3);
    }
}
