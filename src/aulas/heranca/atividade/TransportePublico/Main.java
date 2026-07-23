package aulas.heranca.atividade.TransportePublico;

public class Main {
    public static void main(String[] args) {

        Onibus onibus = new Onibus("103.1", 80, 5.50, "Piracicabana");
        onibus.iniciarViagem();

        Metro metro = new Metro("Verde", 600, 5.50, 4);
        metro.iniciarViagem();
    }
}
