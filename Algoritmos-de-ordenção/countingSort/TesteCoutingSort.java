package countingSort;

public class TesteCoutingSort {

	public static void main(String[] args) {
		
		CountingSort ordenador = new CountingSort();
		
		int [] vetorDesordenado = new int [5];
		
		vetorDesordenado[0] = 3;
		vetorDesordenado[1] = 3;
		vetorDesordenado[2] = 1;
		vetorDesordenado[3] = 2;
		vetorDesordenado[4] = 4;
		
		
		int [] vetorOrdenado = ordenador.sort(vetorDesordenado, 4);
		
		for (int k = 0; k < vetorOrdenado.length; k ++) {
			System.out.println(vetorOrdenado[k]);
		}
		
		

	}

}
