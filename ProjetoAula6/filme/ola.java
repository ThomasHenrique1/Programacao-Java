
package filme;


public class ola {
    public static void main(String[] args) {
        String titulo = "O sofriemnto de uma vida";
        String diretor = "Thomas";
        String genero = "Drama";
        String pais = "Brasil";
        int ano = 2021;
        new Queue().enqueue(new Filme(titulo, diretor, genero, pais, ano));
        new Queue().toString();
                
    }
}

