package sorting;

public class Testes {
    public static void main(String[] args) {
    
        int[] vetor_decrescente = {5, 4, 3, 2, 1};
        int[] vetor_crescente = {1, 2, 3, 4, 5};
        int[] vetor_aleatorio = {10, 4, 3, 22, 11, 5, 6, 7};
        
        AlgoritmoSort bubbleSort = new Bubble();

        
        bubbleSort.sort(vetor_decrescente);
        bubbleSort.sort(vetor_crescente);
        bubbleSort.sort(vetor_aleatorio);

        
        System.out.println("Ordenação com BubbleSort TESTE DECRESCENTE:");
        for (int digito : vetor_decrescente) {
            System.out.print(digito + " ");
        }
        System.out.println();

        System.out.println("Ordenação com BubbleSort TESTE CRESCENTE:");
        for (int digito : vetor_crescente) {
            System.out.print(digito + " ");
        }
        System.out.println();

        System.out.println("Ordenação com BubbleSort TESTE ALEATORIO:");
        for (int digito : vetor_aleatorio) {
            System.out.print(digito + " ");
        }
        System.out.println();


        

        AlgoritmoSort insertionSort = new Insertion();

        insertionSort.sort(vetor_decrescente);

        System.out.println("Ordenacao com InsertionSort TESTE DECRESCENTE:");
        for (int digito : vetor_decrescente ) {
            System.out.print(digito + " ");
        }
        System.out.println();

        insertionSort.sort(vetor_crescente);

        System.out.println("Ordenacao com InsertionSort TESTE CRESCENTE:");
        for (int digito : vetor_crescente ) {
            System.out.print(digito + " ");
        }
        System.out.println();

        insertionSort.sort(vetor_aleatorio);

        System.out.println("Ordenacao com InsertionSort TESTE ALEATORIO:");
        for (int digito : vetor_aleatorio) {
            System.out.print(digito + " ");
        }
        System.out.println();

        AlgoritmoSort selectionSort = new Selection();

        selectionSort.sort(vetor_decrescente);

        System.out.println("Ordenacao com SelectionSort TESTE DECRESCENTE:");
        for (int digito : vetor_decrescente ) {
            System.out.print(digito+ " ");
        }
        System.out.println();


        selectionSort.sort(vetor_crescente);

        System.out.println("Ordenacao com SelectionSort TESTE CRESCENTE:");
        for (int digito : vetor_crescente ) {
            System.out.print(digito+ " ");
        }
        System.out.println();

        selectionSort.sort(vetor_aleatorio);

        System.out.println("Ordenacao com SelectionSort TESTE ALEATORIO:");
        for (int digito : vetor_aleatorio) {
            System.out.print(digito+ " ");
        }
        System.out.println();



    }

}
