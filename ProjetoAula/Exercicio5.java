import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]){
        // Declaração de variáveis
        int i, quant;
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário a quantidade de elementos a serem utilizados no vetor
            System.out.println("Digite a quantidade de elementos a serem utilizados no vetor");
            quant = scanner.nextInt();
            
            // Declaração e alocação de memória para os vetores
            int x[] = new int[quant];
            int par[] = new int[quant];
            int impar[] = new int[quant];
            
            // Preenchimento do vetor com os valores fornecidos pelo usuário e separação dos valores pares e ímpares
            for(i = 0; i < x.length; i++){
                System.out.println("Digite o " + (i + 1) + "º número");
                x[i] = scanner.nextInt();
                if(x[i] % 2 == 0){
                    par[i] = x[i];
                } else {
                    impar[i] = x[i];
                }
            }
            
            // Exibição dos vetores com os valores inseridos, valores pares e valores ímpares
            System.out.println("\nVetor com os valores inseridos\n");
            for(int cont : x){
               System.out.print(cont + ",\t");
            }
            
            System.out.println("\nVetor com os valores pares inseridos\n");
            for(int cont : par){
               System.out.print(cont + ",\t");
            }
            
            System.out.println("\nVetor com os valores ímpares inseridos\n");
            for(int cont : impar){
               System.out.print(cont + ",\t");
            }
        }  
    }
}
