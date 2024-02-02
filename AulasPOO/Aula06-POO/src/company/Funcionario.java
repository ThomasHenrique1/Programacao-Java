package company;

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    Funcionario(){
        setCargo("Assistente");
    }

    Funcionario(int c, float s, String car){
       setCargo(car);
       setSalario(s);
       setCracha(c);
    }
    public float calculaAumento(float porcentagem){

        return getSalario();
    }
    public void calculaAumento(int tempo){

    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
