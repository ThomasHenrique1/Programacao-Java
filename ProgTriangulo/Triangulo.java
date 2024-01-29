import javax.swing.JOptionPane;

public class Triangulo {

    public static void main(String args[]) {
        // Declaração das variáveis para armazenar os lados do triângulo
        float lado1, lado2, lado3;
        
        // Solicita ao usuário que insira o valor do lado 1 do triângulo
        lado1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do lado 1:"));
        
        // Solicita ao usuário que insira o valor do lado 2 do triângulo
        lado2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do lado 2:"));
        
        // Solicita ao usuário que insira o valor do lado 3 do triângulo
        lado3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do lado 3:"));
        
        // Verifica se todos os lados são iguais, indicando um triângulo equilátero
        if ((lado1 == lado2) && (lado2 == lado3)) {
            JOptionPane.showMessageDialog(null, "Temos um triângulo Equilátero");
        } 
        // Verifica se pelo menos dois lados são iguais, indicando um triângulo isósceles
        else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            JOptionPane.showMessageDialog(null,"Temos um triângulo Isósceles");
        }
        // Se nenhum dos casos acima for verdadeiro, indica um triângulo escaleno
        else {
            JOptionPane.showMessageDialog(null, "Temos um triângulo Escaleno");
        }
    }
}
