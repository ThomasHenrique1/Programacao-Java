package ProjetoAula9;

public class exercicio1 {
    public static void main(String[] args) {
        double vetor[]= {4.9,6.1,0.1,1.9,2.4,7.2,5.5};
        double v[] = vetor;
        int i;
        double a = 0;
        int f= v.length -1;
        for(i=0;i<f;i++){
            a = v[i];
            v[i]= v[f];
            v[f] = a;
            f--;


        }
        int b;
        for(b = 0;b<v.length;b++){
            System.out.println(v[b]);
        }
    }
}
