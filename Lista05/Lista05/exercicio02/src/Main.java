import java.util.Scanner;
public class Main {
    public static int funcaofat(int n1) {
        if (n1 <= 0) {
            System.out.println("O número deve ser maior que 0");
            return 0;
        }
        int aux = n1 -1;
        int mult = n1;
        for (int i = aux; i > 1; i--) {
            mult *= i;
        }
        return mult;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        int resultado = funcaofat(n1);
        System.out.println("O número " + n1 + " em fatorial é: " + resultado);
    }
}