
package aulaOito;


public class Trabalhador {
    private int posicaoPilha;
    private String nome;
    private float salario;
    private String sexo;

    public Trabalhador(int posicaoPilha,String nome, float salario, String sexo) {
        this.posicaoPilha = posicaoPilha;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return ("\n"+posicaoPilha
                + ": Nome: " + nome
                + " Salario: R$" + salario
                + " Sexo: " + sexo);
    }
    
}
