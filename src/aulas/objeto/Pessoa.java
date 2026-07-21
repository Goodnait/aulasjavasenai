package aulas.objeto;

public class Pessoa {
    private String nome;
    public int anoNascimento;
    public char genero;
    public String cor;
    public String profissao;

    public Pessoa(String nome, int anoNascimento, char genero, String cor, String profissao) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.genero = genero;
        this.cor = cor;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return nome+", "+
                anoNascimento+", "+
                genero+", "+
                cor+", "+
                profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}