package sorting;

public class Insertion implements AlgoritmoSort {

	public void sort(int[] posicao) {
		
		for (int x = 1; x < posicao.length; x++) {
			int y = x;
			while (y > 0 && posicao[y] < posicao[y-1]) {
				int aux = posicao[y];
				posicao[y] = posicao[y-1];
				posicao[y-1] = aux;
				y -= 1;
			}
		}
	}

}
