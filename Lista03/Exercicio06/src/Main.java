import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();

        int menorNumero = Math.min(n1, n2);
        int maiorNumero = Math.max(n1, n2);

        for (int i = menorNumero + 1; i < maiorNumero; i++) {

            System.out.println(i);
        }


        scanner.close();
    }
}