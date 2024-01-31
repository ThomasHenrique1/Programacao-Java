import java.util.Scanner;

public class exemplo9 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int[] A;
        int i;
        int soma = 0;
        int tamanhoVetor = 10; // Tamanho do vetor
        
        // Criação do vetor A com tamanho predefinido
        A = new int[tamanhoVetor];
        
        // Loop para preencher o vetor A com valores fornecidos pelo usuário
        for (i = 0; i < tamanhoVetor; i++) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Digite o " + (i + 1) + "º valor: ");
                A[i] = scan.nextInt();
            }
        }
        
        // Cálculo da soma dos quadrados dos elementos do vetor
        for (i = 0; i < tamanhoVetor; i++) {
            soma = soma + A[i] * A[i];
        }

        // Exibição dos elementos do vetor
        for (i = 0; i < tamanhoVetor; i++) {
            System.out.println("A[" + (i + 1) + "] = " + A[i]);
        }
        
        // Exibição da soma dos quadrados dos elementos do vetor
        System.out.println("Soma dos quadrados dos elementos do vetor: " + soma);
    }
}
