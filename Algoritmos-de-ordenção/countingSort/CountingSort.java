package countingSort;

public class CountingSort {

	/*
	 * Método de ordenação counting sort recebe um vetor de números inteiros e o
	 * maior valor existente neste vetor.
	 */

	public int [] sort(int[] vetorDesordenado, int maiorElemento) {

		int[] vetorContadores = new int[maiorElemento + 1];
		int[] vetorOrdenado = new int[vetorDesordenado.length];

		// o primeiro for inicia os contadores do vetorContadores

		for (int i = 0; i < vetorContadores.length; i++) {
			vetorContadores[i] = 0;
		}

		// o segundo for conta os elementos

		for (int j = 0; j < vetorDesordenado.length; j++) {

			vetorContadores[vetorDesordenado[j]] = vetorContadores[vetorDesordenado[j]] + 1;
		}

		/*
		 * Agora vetorContadores[i] contém o número de elementos em vetorDesordenado
		 * iguais a i
		 */

		/*
		 * A próxima etapa consiste em usar essas informações para contar elementos
		 * menores ou igual a i
		 */

		for (int i = 1; i < vetorContadores.length; i++) {
			vetorContadores[i] = vetorContadores[i] + vetorContadores[i - 1];
		}

		for (int j = vetorDesordenado.length-1; j >= 0; j--) {
			vetorOrdenado[vetorContadores[vetorDesordenado[j]]-1] = vetorDesordenado[j];
			vetorContadores[vetorDesordenado[j]] = vetorContadores[vetorDesordenado[j]] - 1;

		}

		return vetorOrdenado;
	}

}
