import java.util.Date;

public class OlaMundo {
    public static void main(String args[]){
        // Imprime "Olá Mundo"
        System.out.println("Olá Mundo");
        
        // Imprime a data atual
        System.out.println("Hoje é: " + new Date() + "\n\n\n");
        
        // Cria um objeto da classe Automovel
        Automovel xxx = new Automovel();
        
        // Atribui valores aos atributos do objeto
        xxx.ano = 2020;
        xxx.modelo = "Onix";
        
        // Chama o método andar() do objeto
        xxx.andar();
    }
}
