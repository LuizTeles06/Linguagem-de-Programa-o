public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(5684, "Luiz");

        if(c1.depositar( 100))
            System.out.println("Deposito realizado com sucesso");
        else
            System.out.println("Valor Inválido");
        System.out.println(c1.getSaldo());
        c1.sacar( 13.40);
        System.out.println(c1.getSaldo());






    }

}



