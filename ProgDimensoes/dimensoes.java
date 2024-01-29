import javax.swing.JOptionPane;

public class Dimensões {
    public static void main(String args[]) {
        // Declaração das variáveis para armazenar altura, largura e profundidade
        float altura, largura, profundidade;
        
        // Solicita ao usuário que insira o valor da altura
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a altura:"));
        
        // Solicita ao usuário que insira o valor da largura
        largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a largura:"));
        
        // Solicita ao usuário que insira o valor da profundidade
        profundidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a profundidade:"));
        
        // Chama o método exibirResultado com os valores inseridos pelo usuário
        exibirResultado(altura, largura, profundidade);
    }

    public static void exibirResultado(float altura, float largura, float profundidade) {
        // Divide as dimensões por 100 para converter centímetros para metros
        altura = altura / 100;
        largura = largura / 100;
        profundidade = profundidade / 100;
        
        // Calcula o volume da caixa (altura * largura * profundidade)
        float resultado = altura * largura * profundidade;
        
        // Exibe o volume da caixa em metros cúbicos em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "A caixa tem " + resultado + " m³");
    }
}
