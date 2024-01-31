import java.util.Scanner;

/**
 * Classe de exemplo para demonstrar o uso da classe Trabalhador.
 */
public class UsaraTrabalhador {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            // Criando um objeto Trabalhador
            Trabalhador x = new Trabalhador();

            // Definindo o nome e salário do trabalhador x com entrada do usuário
            System.out.println("Digite o nome do trabalhador x:");
            x.setNome(scan.next());
            System.out.println("Digite o salário do trabalhador x:");
            x.setSalario(scan.nextFloat());

            // Imprimindo os detalhes do trabalhador x
            System.out.println("Detalhes do trabalhador x: ");
            System.out.println("Nome: " + x.getNome() + ", Salário: " + x.getSalario());

            // Criando um segundo objeto Trabalhador com valores pré-definidos
            Trabalhador y = new Trabalhador("Thomas Henrique", 10000.0f);

            // Imprimindo os detalhes do trabalhador y
            System.out.println("\nDetalhes do trabalhador y: ");
            System.out.println("Nome: " + y.getNome() + ", Salário: " + y.getSalario());

            // Imprimindo os detalhes dos trabalhadores utilizando o método toString()
            System.out.println("\nDetalhes do trabalhador x utilizando toString(): ");
            System.out.println(x.toString());
            System.out.println("\nDetalhes do trabalhador y utilizando toString(): ");
            System.out.println(y.toString());
        }
    }   
}
