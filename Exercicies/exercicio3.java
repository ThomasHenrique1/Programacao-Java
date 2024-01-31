import javax.swing.*;

public class exercicio3 {
    public static void main(String args[]) {
        int positivo, negativo; // Variáveis para contar a quantidade de valores positivos e negativos
        float valor, menor; // Variáveis para armazenar os valores e o menor valor
        String resposta = "SIM"; // Variável para armazenar a resposta do usuário para continuar ou não
        positivo = 0; // Inicializa o contador de valores positivos como 0
        negativo = 0; // Inicializa o contador de valores negativos como 0
        menor = Float.MAX_VALUE; // Inicializa o menor valor como o maior valor possível
        // Loop para permitir ao usuário inserir valores até que ele decida parar
        do {            
            // Solicita ao usuário que insira um valor usando a caixa de diálogo JOptionPane
            valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número"));
            // Verifica se o valor inserido é menor do que o menor valor encontrado até agora
            if (valor < menor) {
                menor = valor;
            }
            // Incrementa o contador de valores positivos se o valor inserido for maior ou igual a zero
            if (valor >= 0) {
                positivo++;
            } else { // Incrementa o contador de valores negativos se o valor inserido for menor do que zero
                negativo++;
            }            
            // Pergunta ao usuário se deseja inserir outro valor
            resposta = JOptionPane.showInputDialog(null, "Deseja digitar outro valor (Sim/Não)?");
        } while (resposta.equalsIgnoreCase("SIM"));

        // Exibe a quantidade de valores positivos e negativos e o menor valor usando a caixa de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "Dos números digitados temos: " + positivo + " positivos e " + 
                                        negativo + " negativos");
        JOptionPane.showMessageDialog(null, "O menor valor é " + menor);

    } //fim do método main 
} //fim da classe 
