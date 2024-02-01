package aulaOito;


public final class Trabalhador1 {

    private int posicaoPilha;
    private String nome;
    private float salario;
    private String sexo;

    Trabalhador1(Object top) {
        posicaoPilha = posicaoPilha;
        nome = nome;
        salario = salario;
        sexo = sexo;
}

public Trabalhador1(int posicaoPilha, String nome, float salario, String sexo, Object top) {
        this.posicaoPilha = posicaoPilha;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    @Override
        public String toString() {
        return ("\n" + posicaoPilha
                + ": Nome: " + nome
                + " Salario: R$" + salario
                + " Sexo: " + sexo);
    }
        
        //public  boolean bubbleSort();
}
