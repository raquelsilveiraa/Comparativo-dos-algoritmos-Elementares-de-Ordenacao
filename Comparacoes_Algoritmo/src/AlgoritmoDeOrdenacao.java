import java.util.Arrays;

public class AlgoritmoDeOrdenacao{

	public static void main(String[] args) {
    	int[] array = { 3, 5, 1, 2, 4};

        int[] arrayBolha = Arrays.copyOf(array, array.length);
    	System.out.println("Algortimo Bubble Sort: " + Arrays.toString(Bolha(arrayBolha)));
   	 
    	int[] arrayInsercao = Arrays.copyOf(array, array.length);
    	System.out.println("Algoritmo Insertion Sort: " + Arrays.toString(Insercao(arrayInsercao)));
   	 
    	int[] arraySelecao = Arrays.copyOf(array, array.length);
    	System.out.println("Algoritmo Selection Sort: " + Arrays.toString(Selecao(arraySelecao)));
   	 

   	 
	}

    public static int[] Bolha(int array[]) {
    	for (int i = array.length; i >= 1; i--) {
        	for (int j = 1; j < i; j++) {
            	if (array[j - 1] > array[j]) {
                	int aux = array[j];
                	array[j] = array[j - 1];
                	array[j - 1] = aux;
            	}
        	}
    	}
    	return array;
	}

	public static int[] Insercao (int[] array) {
    	for (int i = 0; i < array.length; i++) {
        	int num = array[i];
        	int j = i - 1;
        	while (j >= 0 && array[j] >= num) {
            	array[j + 1] = array[j];
            	j--;
        	}
        	array[j + 1] = num;
    	}
    	return array;
	}

	public static int[] Selecao(int[] array) {
    	for (int i = 0; i < array.length; i++) {
        	int digitoM = i;
        	for (int j = i + 1; j < array.length; j++) {
            	if (array[j] < array[digitoM]) {
                	digitoM = j;
            	}
        	}

        	int valor = array[digitoM];
        	array[digitoM] = array[i];
        	array[i] = valor;
    	}
    	return array;
	}
    


}

