package selectionSort;

public class SelectionSort {

	public static int[] selectionSort(int[] vetor) {
        //for começa em um indice
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            //esse for começa em um indice a mais que o outro
            for (int j = i + 1; j < vetor.length; j++) {
                //compara todos os elementos do vetor até ver se algum é menor que o minimo 
                if (vetor[j] < vetor[indiceMinimo]) {
                    //se algum dado for menor que o comparado, o indice desse dado é salvo
                    indiceMinimo = j;
                }
            }
            //se ele entrar no if o numero que estava sendo guardado é colocado no lugar do que foi pro seu lugar
            //swap
            int tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }
        return vetor;
    }

}




