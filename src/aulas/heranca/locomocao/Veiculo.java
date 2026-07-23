package aulas.heranca.locomocao;

public class Veiculo {
    private String marca;
    private String placa;
    private int anoFaricacao;
    private String nomeVeiculo;
    private String cor;
    private String categoria;
    private String cambio;
    private int quilometragem;

    public void ligar(){
        System.out.println("O seu veículo "+nomeVeiculo+" está sendo ligado...");
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFaricacao() {
        return anoFaricacao;
    }

    public void setAnoFaricacao(int anoFaricacao) {
        this.anoFaricacao = anoFaricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}