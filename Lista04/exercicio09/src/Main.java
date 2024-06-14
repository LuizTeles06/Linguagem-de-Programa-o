public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{0, 1, 2, 3, 4}
                , {5, 6, 7, 8, 9}
                , {10, 11, 12, 13, 14}
                , {15, 16, 17, 18, 19}
                , {20, 21, 22, 23, 24}};

        int tamanho = matriz.length;
        for (int i= 0; i < tamanho; i++) {
            System.out.println("Diagonal secundária: " + matriz[i][tamanho - i - 1]);
        }





    }

}