package sorting;

public class Main {
    public static void main(String[] args) {
    
        int[] vetor = {3,5,1,2,4};

        
        AlgoritmoSort bubbleSort = new Bubble();

        
        bubbleSort.sort(vetor);

        
        System.out.println("Ordenação com BubbleSort:");
        for (int digito : vetor) {
            System.out.print(digito + " ");
        }
        System.out.println();

        AlgoritmoSort insertionSort = new Insertion();

        insertionSort.sort(vetor);

        System.out.println("Ordenacao com InsertionSort:");
        for (int digito : vetor ) {
            System.out.print(digito + " ");
        }
        System.out.println();

        AlgoritmoSort selectionSort = new Selection();

        selectionSort.sort(vetor);

        System.out.println("Ordenacao com SelectionSort:");
        for (int digito : vetor ) {
            System.out.print(digito+ " ");
        }
        System.out.println();



    }

}
