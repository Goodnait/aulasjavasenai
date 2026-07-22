package aulas.encapsulamento.banco.modelo;

public class ContaBancaria {
    private String titular;
    private int numeroDaConta;
    private double saldo;
    private static int contador = 1;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.numeroDaConta = contador;
        contador++;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void deposistar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor+" foi depositado");
        } else {
            System.out.println("Erro: valor inválido");
        }
    }

    public void sacar(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            System.out.println(valor+" foi retirado da conta");
        }
    }


    private String acessarTodosOsDados(){
        return this.titular;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
}