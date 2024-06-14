public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{0, 1, 2, 3, 4}
                , {5, 6, 7, 8, 9}
                , {10, 11, 12, 13, 14}
                , {15, 16, 17, 18, 19}
                , {20, 21, 22, 23, 24}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i] == matriz[j]) {
                    System.out.println(matriz[i][j]);
                }
            }


        }





    }

}