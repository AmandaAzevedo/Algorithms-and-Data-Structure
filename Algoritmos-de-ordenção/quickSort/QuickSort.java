public class QuickSort {

    public static int[] quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            //achar o pivô
            int posicaoPivo = separar(vetor, inicio, fim);
            //para os numeros maiores e menores que o pivô
            //chama a função de novo pra colocar os outros números na posição correta, 
            //pois o pivô anterior já está certo
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
    }

    // escolher que número vai ser o pivô
    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        // acha a posição certa do pivô
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
