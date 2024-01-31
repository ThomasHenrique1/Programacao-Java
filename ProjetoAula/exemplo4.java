import java.util.Scanner;

public class exemplo4 {
    public static void main(String args[]) {
        // Declaração de Variáveis
        int i, quant; // Variáveis de controle do loop e para armazenar a quantidade de elementos
        int acum = 0; // Variável para armazenar a quantidade de consoantes
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita a quantidade de elementos a serem utilizados no vetor
            System.out.println("Digite a quantidade de elementos a serem utilizados no vetor:");
            quant = scanner.nextInt();

            // Declaração e inicialização do vetor de caracteres
            char x[] = new char[quant];

            // Loop para solicitar e armazenar os caracteres no vetor
            for (i = 0; i < x.length; i++) {
                // Solicita e armazena o i-ésimo caractere no vetor
                System.out.println("Digite a " + (i + 1) + "ª letra:");
                x[i] = scanner.next().charAt(0);

                // Verifica se o caractere não é uma vogal (minúscula ou maiúscula)
                if ((x[i] != 'a') && (x[i] != 'e') && (x[i] != 'i') && (x[i] != 'o') && (x[i] != 'u') &&
                        (x[i] != 'A') && (x[i] != 'E') && (x[i] != 'I') && (x[i] != 'O') && (x[i] != 'U')) {
                    acum++; // Incrementa a quantidade de consoantes
                }
            }

            // Saída de Resultados
            // Exibe a quantidade de consoantes no vetor
            System.out.println("A quantidade de consoantes neste vetor é de: " + acum);

            // Exibe as consoantes presentes no vetor
            System.out.println("As consoantes presentes no vetor são:");
            for (i = 0; i < x.length; i++) {
                // Verifica se o caractere não é uma vogal (minúscula ou maiúscula)
                if ((x[i] != 'a') && (x[i] != 'e') && (x[i] != 'i') && (x[i] != 'o') && (x[i] != 'u') &&
                        (x[i] != 'A') && (x[i] != 'E') && (x[i] != 'I') && (x[i] != 'O') && (x[i] != 'U')) {
                    System.out.print(x[i] + ", "); // Exibe a consoante
                }
            }
        }
    }
}
