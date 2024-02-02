package Exercicios;

public class Analista extends Empregado {

    private float[] valorPorProjeto;


    public float calculaSalario() {
        float salario = 0;
        for (int i = 0; i < valorPorProjeto.length; i++) {
            salario += valorPorProjeto[i];
        }
        return salario;
    }

    Analista() {

    }

    Analista(String nome, String matricula, float valorPorProjeto[]) {
        super(nome, matricula);
        this.setValorPorProjeto(valorPorProjeto);
    }


    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }
}

