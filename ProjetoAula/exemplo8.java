import java.util.Scanner;

public class exemplo8 {
    public static void main(String args[]) {
        try (// Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in)) {
            // Declaração de variáveis
            int i;
            int idade[] = new int[5]; // Vetor para armazenar as idades
            float alt[] = new float[5]; // Vetor para armazenar as alturas
            
            // Loop para solicitar a entrada da idade e altura de 5 pessoas
            for (i = 0; i < 5; i++) {
                System.out.println("Digite a idade da " + (i+1) + "ª pessoa:");
                idade[i] = scanner.nextInt(); // Lê a idade inserida pelo usuário
                System.out.println("Digite a altura da " + (i+1) + "ª pessoa:");
                alt[i] = scanner.nextFloat(); // Lê a altura inserida pelo usuário
                System.out.println(); // Pula uma linha
            }
            
            // Loop para exibir as informações na ordem inversa
            for (i = 4; i >= 0; i--) {
                System.out.println((i+1) + "ª pessoa:");
                System.out.println("- Idade: " + idade[i]); // Exibe a idade
                System.out.println("- Altura: " + alt[i]); // Exibe a altura
                System.out.println(); // Pula uma linha
            }
        }
    }
}
