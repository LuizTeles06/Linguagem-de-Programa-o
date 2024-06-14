public class ContaBancaria {
    // nome da classe UpperCamelCase // atributos e metodos LowerCamelCase
    // metodos geralmente sao verbos
    // atributos
    private int numeroConta;
    private double saldo;
    private String titular;

    // construtor (inicializa os atributos com valores)
    // TEM que ter o mesmo nome da classe
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.titular = titular;
    }

    // metodos
    public boolean depositar(double valor) {
        if(valor<=0)
            return false;
        this.saldo+=valor; // refere-se ao atributo saldo
        return true;
    }

    public boolean sacar(double valor) {
        if (valor<=0 || saldo < valor)
            return false;
        this.saldo-=valor;
        return true;
    }

    //getters and setters
    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // toString()


    @Override // substituir o toString padrao por este
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}