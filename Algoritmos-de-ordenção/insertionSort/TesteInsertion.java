package insertionSort;

public class TesteInsertion {

	public static void main(String[] args) {

		InsertionSort ordenador = new InsertionSort();

		Comparable[] vetorDesordenado = new Comparable[5];

		vetorDesordenado[0] = 4;
		vetorDesordenado[1] = 3;
		vetorDesordenado[2] = 2;
		vetorDesordenado[3] = 3;
		vetorDesordenado[4] = 1;

		ordenador.insertionSort(vetorDesordenado);

		for (int k = 0; k < vetorDesordenado.length; k++) {
			System.out.println(vetorDesordenado[k]);
		}

	}

}
