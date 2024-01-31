import javax.swing.JOptionPane;

public class Prg_Desafio {
    public static void main(String args[]) {
        // Declaração das variáveis para armazenar as coordenadas dos pontos e a distância
        double x1, y1, x2, y2, distancia;
        
        // Solicita ao usuário que insira o valor de x1
        x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de x1:"));
        
        // Solicita ao usuário que insira o valor de y1
        y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de y1:"));
        
        // Solicita ao usuário que insira o valor de x2
        x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de x2:"));
        
        // Solicita ao usuário que insira o valor de y2
        y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de y2:"));
        
        // Calcula a distância entre os dois pontos usando a fórmula da distância euclidiana
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        // Exibe a distância entre os dois pontos em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "A distância entre os dois pontos é: " + distancia);
    }
}
