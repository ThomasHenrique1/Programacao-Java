package Exemplo2;

public class Vestuario extends Produto{
    private String nome;
    private String cor;
    private String tamanho;

    Vestuario(){

    }

    Vestuario(String c, String d, float v, String n, String fco, String t){

    }
    @Override
    public void print(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
