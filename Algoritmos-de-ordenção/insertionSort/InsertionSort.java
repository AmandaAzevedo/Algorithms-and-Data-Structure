package insertionSort;

public class InsertionSort {

	    public static int[] insertionSort(int[] vetor) {

        //for pra pegar os numeros a serem comparados
        for (int i = 1; i < vetor.length; i++) {
            
            //pega um numero
            int segundo = vetor[i], tmp;

           /* for pra ver se o numero da variável temporaria é maior que o atual
            * se for maior ele troca os numeros de lugar
            */
            for (tmp = i - 1; tmp >= 0 && vetor[tmp] > segundo; tmp--) {
                vetor[tmp + 1] = vetor[tmp];
            }

            /* manda pra o indice o numero maior
             * se o numero maior já tiver no lugar dele, só repete
             */
            vetor[tmp + 1] = segundo;
        }

        return vetor;
    }

}





