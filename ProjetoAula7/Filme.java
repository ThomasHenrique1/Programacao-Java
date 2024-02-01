public class Filme {
    private String titulo, diretor, genero, pais;
    private int ano;

    public Filme(String titulo, String diretor, String genero, String pais, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
    }
    
    @Override
    public String toString(){
        return ("\nTítulo: " + titulo
                + "Diretor: " + diretor
                + "Gênero: " + genero
                + "País: " + pais
                + "Ano: " + ano);
    }
}
