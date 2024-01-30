import java.util.Scanner;

public class exercicio3 {
    public static void main(String args[]) {
        // Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis para armazenar o número de parcelas, o valor do produto e o total a ser pago
        double parcelas;
        double valor;
        double total;
        
        // Solicita ao usuário que insira o valor do produto
        System.out.println("Informe o valor do produto: ");
        valor = scanner.nextDouble();
        
        // Solicita ao usuário que insira o número de parcelas
        System.out.println("Informe o número de parcelas 1 a 4 ou mais vezes: ");
        parcelas = scanner.nextDouble();
        
        // Verifica o número de parcelas e calcula o total a ser pago com base nesse número
        if(parcelas == 1) {
            total = valor;
            System.out.println("O total é: " + total + " Resultado");
        } else if(parcelas == 2 || parcelas == 3) {
            total = valor + (valor * 0.10);
            System.out.println("O total é: " + total + " Resultado");
        } else {
            if(parcelas >= 4) {
                total = valor + (valor * 0.20);
                System.out.println("O total é: " + total + " Resultado");
            }
        }  
    }
}
