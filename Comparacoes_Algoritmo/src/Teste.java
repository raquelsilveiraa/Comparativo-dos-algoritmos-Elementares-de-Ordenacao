import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        
        int[] crescente = {1, 2, 3, 4, 5} ;
        int[] decrescente = { 5, 4, 3, 2, 1};
        int[] aleatorio = { 3, 5, 1, 2, 4} ;
         


        System.out.println("\nBubble Sort:");
        teste("Ordem Crescente", Arrays.copyOf(crescente, crescente.length), "Bubble Sort");
        teste("Ordem Decrescente", Arrays.copyOf(decrescente, decrescente.length), "Bubble Sort");
        teste("Ordem Aleatório", Arrays.copyOf(aleatorio, aleatorio.length), "Bubble Sort");

        System.out.println("\nInsertion Sort:");
        teste("Ordem Crescente", Arrays.copyOf(crescente, crescente.length), "Insertion Sort");
        teste("Ordem Decrescente", Arrays.copyOf(decrescente, decrescente.length), "Insertion Sort");
        teste("Ordem Aleatório\\n", Arrays.copyOf(aleatorio, aleatorio.length), "Insertion Sort");
        System.out.println();

        
        System.out.println("\nSelection Sort:");
        teste("Ordem Crescente", Arrays.copyOf(crescente, crescente.length), "Selection Sort");
        teste("OrdemDecrescente", Arrays.copyOf(decrescente, decrescente.length), "Selection Sort");
        teste("OrdemAleatório", Arrays.copyOf(aleatorio, aleatorio.length), "Selection Sort");
        System.out.println();

    
    }

    public static void teste(String tipo, int[] vetor, String metodo) {
        long inicio = System.nanoTime();

        if (metodo.equals("Insertion Sort")) {
            Insercao(vetor);
        } else if (metodo.equals("Selection Sort")) {
            Selecao(vetor);
        } else if (metodo.equals("Bubble Sort")) {
            Bolha(vetor);
        }

        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;
        int numComparacoes = getNumComparacoes();
        int numTrocas = getNumTrocas();

        System.out.println("\nTipo: " + tipo);
        System.out.println("Método: " + metodo);
        System.out.println("Array Ordenado: " + Arrays.toString(vetor));
        System.out.println("Tempo de Execução: " + tempoExecucao + " nanosegundos");
        System.out.println("Número de Comparações: " + numComparacoes);
        System.out.println("Número de Trocas: " + numTrocas);
    }

    
    private static int comparacoes;
    private static int trocas;

    public static int getNumComparacoes() {
        int numComparacoes = comparacoes;
        comparacoes = 0; 
        return numComparacoes;
    }

    public static int getNumTrocas() {
        int numTrocas = trocas;
        trocas = 0; 
        return numTrocas;
    }

    public static int[] Bolha(int vetor[]) {
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                    trocas++;
                }
                comparacoes++;
            }
        }
        return vetor;
    }

    public static int[] Insercao(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= valor) {
                vetor[j + 1] = vetor[j];
                j--;
                comparacoes++;
                trocas++;
            }
            vetor[j + 1] = valor;
        }
        return vetor;
    }

    public static int[] Selecao(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int indice_Minimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indice_Minimo]) {
                    indice_Minimo = j;
                }
                comparacoes++;
            }

            int valor = vetor[indice_Minimo];
            vetor[indice_Minimo] = vetor[i];
            vetor[i] = valor;
            trocas++;
        }
        return vetor;
    }

  

    
}

