import java.util.Scanner;
public class Main {
    public static int funcao(int n1) {
        if (n1 <= 0) {
            System.out.println("O número deve ser maior que 0");
            return 0;
        }

        int somatd = 0;
        for (int i = 1; i < n1; i++) {
            somatd += i;
        }
        return somatd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        int resultado = funcao(n1);
        System.out.println("A soma dos números de 1 até " + n1 + " é " + resultado);
    }
}