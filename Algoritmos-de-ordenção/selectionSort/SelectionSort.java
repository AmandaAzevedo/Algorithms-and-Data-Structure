package selectionSort;

public class SelectionSort {

	public void selectionSort(int[] vetorDesordenado) {

		for (int i = 0; i < vetorDesordenado.length; i++) {
			int min = i;

			for (int j = i + 1; j < vetorDesordenado.length; j++) {
				// if (vetorDesordenado[j].compareTo(vetorDesordenado[min]) < 0) {
				if (vetorDesordenado[j] < vetorDesordenado[min]) {
					min = j;
				}
			}

			int swap = vetorDesordenado[i];
			vetorDesordenado[i] = vetorDesordenado[min];
			vetorDesordenado[min] = swap;

		}
	}

}
