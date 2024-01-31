import java.util.Scanner;

public class velocidade {
    public static void main(String args[]) {
        try (// Criação do objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in)) {
            // Declaração das variáveis para armazenar a distância, tempo e velocidade média
            float distancia, tempo, vmedia;
            
            // Solicita ao usuário que insira a distância percorrida pelo piloto em km
            System.out.println("Digite a distância percorrida pelo piloto em km: ");
            distancia = scanner.nextFloat();
            
            // Solicita ao usuário que insira o tempo transcorrido em horas
            System.out.println("Digite o tempo transcorrido, em hora: ");
            tempo = scanner.nextFloat();
            
            // Calcula a velocidade média
            vmedia = distancia / tempo;
            
            // Verifica se o tempo e a distância são valores positivos
            if (tempo >= 0 && distancia >= 0) {
                // Se ambos forem positivos, exibe a velocidade média
                System.out.println("Sua velocidade média final foi de: " + vmedia + " Km/h");
            } else if (tempo <= 0) {
                // Se o tempo for negativo ou zero, exibe uma mensagem de erro relacionada ao tempo
                System.out.println("OPS!\nErro 404, o valor de tempo deve ser positivo");
                System.out.println("Tente novamente ");
            } else {
                // Se a distância for negativa ou zero, exibe uma mensagem de erro relacionada à distância
                System.out.println("OPS!\nErro 404, o valor percorrido deve ser positivo");
                System.out.println("Tente novamente !");
            }
        }
    }
}
