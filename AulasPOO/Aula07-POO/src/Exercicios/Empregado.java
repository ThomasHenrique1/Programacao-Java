package Exercicios;

public abstract class Empregado {
    private String nome;
    private String matricula;
    Empregado(){

    }
    Empregado(String nome, String matricula){
    this.nome= nome;
    this.matricula=matricula;
    }
    public abstract float calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
