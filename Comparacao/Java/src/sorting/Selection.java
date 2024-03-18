package sorting;

public class Selection implements AlgoritmoSort {

	
	public void sort(int[] posicao) {

		
		for (int x = 0; x < posicao.length; x++) {
			int seleciona_menor = x;
			for (int y = x + 1; y < posicao.length; y++)
				if (posicao[y] < posicao[seleciona_menor])
						seleciona_menor = y;
			
		int auxiliar = posicao[x];
			posicao[x] = posicao[seleciona_menor];
			posicao[seleciona_menor] = auxiliar;
		}
		
	}

}
