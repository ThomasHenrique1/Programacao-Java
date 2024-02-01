package aulaOito;

//import java.util.Arrays;
public class Pilha1 {

    public static void main(String[] args) {
        Pilha1 pilha1 = new Pilha1();
    }

    @SuppressWarnings("empty-statement")
    public Pilha1() {
        Pilha pilha = new Pilha();
        Trabalhador1 trabalhador1;
        int cont = 0;
        
        //Inserir (vários) trabalhadores na pilha.
        //Listar os trabalhadores guardados na pilha.
        for (int i = 0; i < 4; i++) {
            pilha.push(new Trabalhador(i, "ISmael", i * 1000.00f, "m"));
            ++cont;
        }
        
        System.out.println("\nO conteúdo da pila é " + pilha.toString() + "\n");

        // Retirar um objeto trabalhador da pilha.
        System.out.println("\nO valor Retirado da pilha é " + pilha.pop());

        //Extrair os elementos guardados na pilha e visualizá-los na ordem
        //em que foram extraídos. Vá guardando os elementos extraídos
        //em um vetor.
        System.out.println("\n Extraindo os elementos");
        while (!pilha.isEmpty()) {
            trabalhador1 = new Trabalhador1(pilha.top());
            System.out.println(trabalhador1);
            System.out.println(pilha.pop());
        }
    }

}
