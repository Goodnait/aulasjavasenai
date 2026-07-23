package aulas.heranca.atividade.TransportePublico;

class TransportePublico {
    private String numeroDaLinha;
    private int capacidadePassageiros;
    private double tarifa;

    public TransportePublico(String numeroDaLinha, int capacidadePassageiros, double tarifa) {
        this.numeroDaLinha = numeroDaLinha;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tarifa = tarifa;
    }

    public void iniciarViagem() {
        System.out.println("Viagem do transporte público iniciada.");
    }

    public String getNumeroDaLinha() {
        return numeroDaLinha;
    }

    public void setNumeroDaLinha(String numeroDaLinha) {
        this.numeroDaLinha = numeroDaLinha;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
