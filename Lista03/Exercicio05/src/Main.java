import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int n1 = numero - 1;

        for (int i = n1; i > 1 ; i--) {

            int fatorial = numero *= i;

            System.out.println("O fatorial é: " + fatorial);
        }



        scanner.close();
    }
}