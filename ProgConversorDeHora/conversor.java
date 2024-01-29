import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String args[]) {
        // Declaração das variáveis para armazenar as horas e minutos
        int horas, minutos;
        
        // Solicita ao usuário que insira a quantidade de horas
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas:"));
        
        // Solicita ao usuário que insira a quantidade de minutos
        minutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de minutos:"));
        
        // Chama o método converteEmMinutos com os valores inseridos pelo usuário
        converteEmMinutos(horas, minutos);
    }

    public static void converteEmMinutos(int hora, int minuto) {
        int resultado;
        // Calcula o total de minutos a partir das horas e minutos fornecidos
        resultado = (hora * 60) + minuto;
        
        // Exibe o resultado da conversão em minutos em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "Conversor de hora em minutos: " + resultado);
    }
}
