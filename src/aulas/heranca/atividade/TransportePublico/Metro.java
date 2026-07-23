package aulas.heranca.atividade.TransportePublico;

class Metro extends TransportePublico {
    private int quantidadeVagoes;

    public Metro(String numeroDaLinha, int capacidadePassageiros, double tarifa, int quantidadeVagoes) {
        super(numeroDaLinha, capacidadePassageiros, tarifa);
        this.quantidadeVagoes = quantidadeVagoes;
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Metrô saindo da Estação Central de Brasília.");
    }

    public void anunciarProximaEstacao() {
        System.out.println("Atenção passageiros, próxima estação: Galeria.");
    }

    public int getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(int quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }
}
