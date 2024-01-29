import javax.swing.JOptionPane;

public class somarDoisValores {
    public static void main(String ars[]) {
        // Declaração das variáveis para armazenar os valores a serem somados
        float a, b;
        
        // Solicita ao usuário que insira o primeiro valor
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor:"));
        
        // Solicita ao usuário que insira o segundo valor
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));
        
        // Exibe a soma dos valores em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "A soma dos valores de " + a + " e " + b + " é " + somaDoisValores(a, b));
    }

    // Método para somar dois valores e retornar o resultado
    public static float somaDoisValores(float x, float y) {
        float result;
        result = x + y;
        return result;
    }

    // Método para exibir a mensagem com a soma dos valores (não usado no main)
    public static void messagemSoma(float x, float y) {
        JOptionPane.showMessageDialog(null, "A soma dos valores de " + x + " e " + y + " é " + somaDoisValores(x, y));
    }

}
