import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        int i = 2;
        while (i < n1) {
            int resto = n1 % i;
            if (resto == 0) {
                System.out.println("O número não é primo");
                return;
            }
            i++;
        }


        System.out.println("O número é primo");
    }
}