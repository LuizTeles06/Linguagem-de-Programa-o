import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int j = v1.length - 1; j >= 0; j--) {
            System.out.println(v1 [j]);
        }

        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1 [i]);
        }



    }
}