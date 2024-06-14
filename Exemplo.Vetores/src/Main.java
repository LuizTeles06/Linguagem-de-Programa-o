import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//int [] numeros = {1,9,6,7,8}; // declaraca e inicilizacao de um array
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5]; // define o numero de vetores

/*System.out.println("Digite 5 numeros separados por espaço: ");
for(int i=0;i<numeros.length;i++)
    numeros[i]=in.nextInt();*/

        for (int i = 0; i < numeros.length; ++i) {
            System.out.println("Digite o valor " + (i + 1) + " :");
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

            for (int todos : numeros)  //pega todos os vetores da variavel numeros
            {System.out.println(todos);

            }

            }
        }

    }