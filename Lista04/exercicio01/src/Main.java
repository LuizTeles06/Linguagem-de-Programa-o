public class Main {
    public static void main(String[] args) {

        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor original: " + vetor[i]);

        }

        for (int j = vetor.length -1; j >= 0; j--) {
            System.out.println("Vetor invertido: " + vetor[j]);
        }

    }
}