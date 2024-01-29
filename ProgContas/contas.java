import javax.swing.*;

public class contas {

    public static void main(String args[]) {
        // Declaração das variáveis para armazenar os valores e operador aritmético
        float a, b;
        String op;
        
        // Solicita ao usuário que insira o valor de a
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de a:"));
        
        // Solicita ao usuário que insira o valor de b
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de b:"));
        
        // Solicita ao usuário que insira o operador aritmético
        op = JOptionPane.showInputDialog(null, "Digite o operador aritmético: (+, -, /, *)");
        
        // Chama o método calcular e exibe o resultado
        calcular(a, b, op);
    }

    public static float calcular(float a, float b, String op) {
        float resp = 0;
        // Verifica qual operação aritmética foi selecionada e realiza o cálculo correspondente
        if (op.equals('+')) {
            resp = a + b;
        } else if (op.equals('-')) {
            resp = a - b;
        } else if (op.equals('/')) {
            resp = a / b;
        } else if (op.equals('*')) {
            resp = a * b;
        }
        
        // Exibe a expressão e o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, a + " " + op + " " + b + " = " + resp);
        
        // Retorna 0 como o valor padrão (não usado neste caso)
        return 0;
    }

}
