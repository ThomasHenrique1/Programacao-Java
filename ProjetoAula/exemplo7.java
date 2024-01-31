import java.util.Scanner;

public class exemplo7 {
    public static void main(String args[]) {
        // Declaração de variáveis
        float mult = 1; // Variável para armazenar o produto dos números
        int i, soma = 0; // Variáveis para armazenar a soma dos números e controlar o loop
        try (Scanner scanner = new Scanner(System.in)) {
            int x[] = new int[5]; // Vetor para armazenar os números

            // Loop para solicitar a entrada de 5 números e calcular a soma e o produto
            for (i = 0; i < x.length; i++) {
                System.out.println("Digite o " + (i + 1) + "º número:");
                x[i] = scanner.nextInt(); // Lê o número inserido pelo usuário
                soma += x[i]; // Adiciona o número à soma total
                mult *= x[i]; // Multiplica o número ao produto total
            }
        }
        // Exibe a soma dos números inseridos
        System.out.println("A soma dos números é " + soma);

        // Exibe o produto dos números inseridos
        System.out.println("O produto dos números é " + mult);
    }
}
