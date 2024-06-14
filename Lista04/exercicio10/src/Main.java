

public class Main {
    public static void main(String[] args) {


        // Definição das matrizes
        int[][] matriz1 = {{1, 2},
                {3, 4},
                {5, 6}};

        int[][] matriz2 = {{7, 8},
                {9, 10}};

        // Verificando se a multiplicação é possível
        if (matriz1[0].length != matriz2.length) {
            System.out.println("Não é possível multiplicar as matrizes.");
            return;
        }

        // Definição da matriz produto
        int[][] produto = new int[matriz1.length][matriz2[0].length];

        // Multiplicação das matrizes
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    produto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Imprimindo a matriz produto
        System.out.println("Matriz Produto:");
        for (int i = 0; i < produto.length; i++) {
            for (int j = 0; j < produto[0].length; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
