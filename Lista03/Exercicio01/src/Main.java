import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();

        int i = 0;

        while (i<=10) {

            System.out.println(n1*i);

            i++;

        }

    }
}