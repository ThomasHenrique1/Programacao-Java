package ProjetoAula9;

import java.util.ArrayList;

public class ordenacao {
    public static void main(String[] args) {


                ArrayList<Double> num = new ArrayList<Double>();
                num.add(4.3);
                num.add(6.1);
                num.add(0.1);
                num.add(1.9);
                num.add(2.4);
                num.add(7.2);
                num.add(5.5);
                System.out.println(num);
                inverter(num);
                System.out.println(num);
            }

            private static void inverter(ArrayList<Double> num) {
                double aux;
                int ct=6;
                int in=0;

                for(int i=0;i<num.size();i++){
                    for(int j=0;j<ct;j++){
                        aux = num.get(in);
                        num.remove(in);
                        num.add(aux);
                    }
                    ct--;
                    in++;
                }
            }
}
