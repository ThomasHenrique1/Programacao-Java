import java.util.Scanner;

public class exemplo3 {
    public static void main(String args[]) {
        // Declaração de Variáveis
        float total = 0, media; // Variáveis para armazenar o total das notas e a média
        int i; // Variável de controle do loop
        float x[] = new float[4]; // Vetor para armazenar as notas
        try (Scanner scanner = new Scanner(System.in)) {
            // Loop para solicitar e armazenar as notas no vetor
            for (i = 0; i < x.length; i++) {
                // Solicita e armazena a i-ésima nota no vetor
                System.out.println("Digite a " + (i + 1) + "ª nota:");
                x[i] = scanner.nextFloat();

                // Soma a nota ao total
                total += x[i];
            }
        }

        // Calcula a média das notas
        media = total / x.length;

        // Saída de Resultados
        // Exibe as notas digitadas
        System.out.println("Notas digitadas:");
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
        System.out.println(); // Imprime uma nova linha para separar a próxima saída

        // Exibe a média das notas
        System.out.println("Média das notas digitadas: " + media);
    }
}
