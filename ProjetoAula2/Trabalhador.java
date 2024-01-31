/**
 * Classe que representa um trabalhador com atributos como nome e salário.
 */
public class Trabalhador {
    private float salario; // Salário mensal do trabalhador
    private String nome; // Nome do trabalhador

    /**
     * Construtor padrão que inicializa o salário como 0 e o nome como "sem nome".
     */
    public Trabalhador() {
        salario = 0.0f;
        nome = "sem nome";
    }

    /**
     * Construtor que permite especificar o nome e o salário do trabalhador.
     * @param nome Nome do trabalhador.
     * @param salario Salário mensal do trabalhador.
     */
    public Trabalhador(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    /**
     * Construtor que permite especificar o salário e o nome do trabalhador.
     * @param salario Salário mensal do trabalhador.
     * @param nome Nome do trabalhador.
     */
    public Trabalhador(float salario, String nome) {
        this.nome = nome;
        this.salario = salario;
    }

    /**
     * Construtor que permite especificar apenas o salário do trabalhador.
     * @param salario Salário mensal do trabalhador.
     */
    public Trabalhador(float salario) {
        this.salario = salario;
    }

    /**
     * Construtor que permite especificar apenas o nome do trabalhador.
     * @param nome Nome do trabalhador.
     */
    public Trabalhador(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o nome do trabalhador.
     * @return Nome do trabalhador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para obter o salário do trabalhador.
     * @return Salário do trabalhador.
     */
    public float getSalario() {
        return salario;
    }

    /**
     * Método para definir o nome do trabalhador.
     * @param nome Nome do trabalhador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para definir o salário do trabalhador.
     * @param salario Salário do trabalhador.
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * Retorna uma representação em formato de string dos detalhes do trabalhador.
     * @return String representando os detalhes do trabalhador.
     */
    public String toString() {
        String relatorio = "";
        relatorio += "O trabalhador " + getNome() + " tem um salário mensal de: " + getSalario() +
                      " e recebe por ano " + calculaSalarioAnual();
        return relatorio;
    }

    /**
     * Calcula e retorna o salário anual do trabalhador com base no salário mensal.
     * Considera o pagamento do 13º salário e o adicional de férias.
     * @return Salário anual do trabalhador.
     */
    public float calculaSalarioAnual() {
        return (getSalario() * 13 + getSalario() / 3);
    }
}
