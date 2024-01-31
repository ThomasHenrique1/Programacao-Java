import javax.swing.JOptionPane;

// Algoritmo para calcular a média e o maior valor de uma série de valores inseridos pelo usuário
public class exercicio2 {

    public static void main(String args[]) {
        int N; // Variável para contar a quantidade de valores inseridos
        double valor, soma, maior; // Variáveis para armazenar os valores e os resultados
        String resp = "SIM"; // Variável para armazenar a resposta do usuário para continuar ou não
        N = 0; // Inicializa o contador de valores como 0
        soma = 0; // Inicializa a soma como 0
        maior = -99999; // Inicializa o maior valor como um valor muito pequeno
        // Loop para permitir ao usuário inserir valores até que ele decida parar
        while (resp.equalsIgnoreCase("SIM")) {
            // Solicita ao usuário que insira um valor usando a caixa de diálogo JOptionPane
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor: ",
                    "Dado", JOptionPane.INFORMATION_MESSAGE));
            // Adiciona o valor à soma total
            soma += valor;
            // Incrementa o contador de valores
            N++;
            // Verifica se o valor inserido é maior do que o maior valor encontrado até agora
            if (valor > maior) {
                maior = valor;
            }
            // Pergunta ao usuário se deseja inserir outro valor
            resp = JOptionPane.showInputDialog(null, "Deseja digitar outro valor (Sim/Não)?",
                    "Outro", JOptionPane.INFORMATION_MESSAGE);
        }
        // Exibe a média e o maior valor usando a caixa de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "A média dos valores digitados é " + soma / N,
                "Média", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O maior dos valores digitados é " + maior,
                "Maior", JOptionPane.INFORMATION_MESSAGE);
    }
}

