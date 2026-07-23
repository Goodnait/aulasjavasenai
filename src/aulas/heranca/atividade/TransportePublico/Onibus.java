package aulas.heranca.atividade.TransportePublico;

class Onibus extends TransportePublico {
    private String nomeViacao;

    public Onibus(String numeroDaLinha, int capacidadePassageiros, double tarifa, String nomeViacao) {
        super(numeroDaLinha, capacidadePassageiros, tarifa);
        this.nomeViacao = nomeViacao;
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Ônibus da viação " + this.nomeViacao + " saindo da Rodoviária do Plano.");
    }

    public void abrirPortasTraseiras() {
        System.out.println("Portas traseiras do ônibus abertas.");
    }

    // Getter e Setter exclusivo
    public String getNomeViacao() {
        return nomeViacao;
    }

    public void setNomeViacao(String nomeViacao) {
        this.nomeViacao = nomeViacao;
    }
}
