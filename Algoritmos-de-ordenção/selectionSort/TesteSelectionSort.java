package selectionSort;

public class TesteSelectionSort {

	public static void main(String[] args) {

		SelectionSort ordenador = new SelectionSort();

		// Comparable [] vetorDesordenado = new Comparable [5];
		int[] vetorDesordenado = new int[5];

		vetorDesordenado[0] = 3;
		vetorDesordenado[1] = 4;
		vetorDesordenado[2] = 1;
		vetorDesordenado[3] = 2;
		vetorDesordenado[4] = 3;

		ordenador.selectionSort(vetorDesordenado);

		for (int k = 0; k < vetorDesordenado.length; k++) {
			System.out.println(vetorDesordenado[k]);
		}

	}

}
