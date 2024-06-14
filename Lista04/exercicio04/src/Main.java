import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int[] numeros = new int[10];
        int menor = numeros [0];
        int maior = numeros [0];
        int posicao = 0;
        int posicao1 = 0;


        for (int i = 0; i < numeros.length; i++ ) {
            System.out.println("Digite 10 números");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior ) {
                maior = numeros[i];
                posicao = i;
            }
            if (numeros [i] < menor) {
                menor = numeros [i];
                posicao1 = i;

            }

        }

        System.out.println("o numero maior é: " + maior + " e esta na posição " + posicao);
        System.out.println("o numero menor é: " + menor + " e esta na posição " + posicao1);







    }
}