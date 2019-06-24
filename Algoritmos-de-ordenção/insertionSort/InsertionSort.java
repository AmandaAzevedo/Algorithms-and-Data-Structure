package insertionSort;

public class InsertionSort {

	public void insertionSort(Comparable[] vetorDesordenado) {

		Comparable chave;
		int i;

		for (int j = 0; j < vetorDesordenado.length; j++) {
			chave = vetorDesordenado[j];
			i = j - 1;

			while (i >= 0 && vetorDesordenado[i].compareTo(chave) > 0) {
				vetorDesordenado[i + 1] = vetorDesordenado[i];
				i = i - 1;
			}

			vetorDesordenado[i + 1] = chave;
		}
	}
}
