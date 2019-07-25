package countingSort;

public class CountingSort {

	/*
	 * M�todo de ordena��o counting sort recebe um vetor de n�meros inteiros desordenados e
	 * retorna um outro vetor com os mesmos n�meros, s� que ordenados .
	 */

	public static int[] CountingSort(int[] vetorDesordenado) {

        int maiorElementoDoVetor = vetorDesordenado[0];
        //encontra o maior valor do vetor
        for (int i = 0; i < vetorDesordenado.length; i++) {
            if (vetorDesordenado[i] > maiorElementoDoVetor) {
                maiorElementoDoVetor = vetorDesordenado[i];
            }
        }

        
        int[] vetorAuxiliar = new int[maiorElementoDoVetor + 1]; //+1 pois se 10 for o maior valor, ele iria apenas de 0 a 9

        //conta quantas vezes cada valor aparece no vetorDesordenado
        for (int i = 0; i < vetorDesordenado.length; i++) {
            vetorAuxiliar[vetorDesordenado[i]] += 1;
        }

        //o for est� percorrendo o vetorAuxiliar e achando o indice final de cada dado
        for (int i = 1; i < vetorAuxiliar.length; i++) {
            vetorAuxiliar[i] += vetorAuxiliar[i - 1];
        }

        //criando uma lista do mesmo tamanho da original toda zerada
        int[] vetorOrdenado = new int[vetorDesordenado.length];

        //percorre a lista do fim para o inicio
        for (int i = vetorOrdenado.length - 1; i >= 0; i--) {

            //achar o lugar que cada dado ser� colocado para ordenar a lista
            vetorOrdenado[vetorAuxiliar[vetorDesordenado[i]] - 1] = vetorAuxiliar[vetorDesordenado[i]];
            //o indice onde estava guardado o dado � subtraido 1, para saber que um numero j� foi

            //adicionado e saber quantos faltam adicionar, daquele mesmo dado
            vetorAuxiliar[vetorDesordenado[i]]--;
        }

        return vetorOrdenado;

    }
}
