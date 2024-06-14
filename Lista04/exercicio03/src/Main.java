import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean encontrado = false;
        int posicao = 0;
        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Digite um número inteiro");k
        int n1 = in.nextInt();


        for ( int i = 0; i < vetor.length; i++) {
            if (n1 == vetor [i]) {
                 posicao = i;
                encontrado = true;
                break;
            }

        }

        if (encontrado == true) {

            System.out.println("Valor encontrado na posição " + posicao);
        }

        else {
            System.out.println("Valor não encontrado");
        }
     }
}
