package Exemplo1;

public class Pessoa {
    private String nome;
    private String fone;

    public  Pessoa(){}

    public Pessoa(String n, String f){
        nome = n;
        fone = f;
    }
    public void print(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
