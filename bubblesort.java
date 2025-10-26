public class bubblesort {
    static void bubbleSort(int tamanho, int []vetor){
        int temp = 0, troca = 0, iteracao = 0;
        long inicio = System.nanoTime(); // tempo inicial

        for (int i = 0; i < tamanho; i++) {
            boolean houveTroca = false; // flag de parada
            for (int j = 1; j < tamanho - i; j++) {
                if (vetor[j-1] > vetor[j]) {
                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                    troca++;
                    houveTroca = true; // marca que houve troca
                }
                iteracao++;
            }
            iteracao++;
            
            if (!houveTroca) { // se não houve troca, o array já está ordenado
                break;
            }
        }

        long fim = System.nanoTime(); // tempo final
        double tempoMs = (fim - inicio) / 1_000_000.0; // converte para milissegundos
        System.out.println("Tempo de execução: " + tempoMs + " ms");
        System.out.println("Trocas: " + troca);
        System.out.println("Iterações: " + iteracao);
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        bubbleSort(20, vetor1);

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        bubbleSort(20, vetor2);
        
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        bubbleSort(20, vetor3);
    }
}
