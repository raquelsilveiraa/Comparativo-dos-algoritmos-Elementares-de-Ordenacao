package sorting;

public class Bubble implements AlgoritmoSort {

    
    public void sort(int[] posicao) {
        int numero = posicao.length;
        for (int i = 0; i < numero-1; i++) {
            for (int j = 0; j < numero-i-1; j++) {
                if (posicao[j] > posicao[j+1]) {
                    int aux = posicao[j];
                    posicao[j] = posicao[j+1];
                    posicao[j+1] = aux;
                }
            }
        }
        
    }
}
