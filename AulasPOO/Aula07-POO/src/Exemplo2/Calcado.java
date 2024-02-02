package Exemplo2;

public class Calcado extends Vestuario {
    private String materialsola;
    private String materialpartesupeerior;
    private String materialinterno;

    Calcado(){

    }

    Calcado(int c, String d, float v, String co, String t,String ms,String mps,String mi){

    }
    @Override
    public void print(){

    }

    public String getMaterialsola() {
        return materialsola;
    }

    public void setMaterialsola(String materialsola) {
        this.materialsola = materialsola;
    }

    public String getMaterialpartesupeerior() {
        return materialpartesupeerior;
    }

    public void setMaterialpartesupeerior(String materialpartesupeerior) {
        this.materialpartesupeerior = materialpartesupeerior;
    }

    public String getMaterialinterno() {
        return materialinterno;
    }

    public void setMaterialinterno(String materialinterno) {
        this.materialinterno = materialinterno;
    }
}
