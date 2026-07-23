package aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto motoEletrica = new MotoEletrica();
        Moto motoACombustao = new MotoACombustao();

        motoEletrica.abastecer();
        motoACombustao.abastecer();
    }
}