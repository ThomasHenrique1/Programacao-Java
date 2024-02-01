package ProjetoAula8;

import java.util.Arrays;

public class exercicio2 {
     public static void main(String[] args) {
        String  []paises = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        bubble_sort(paises);
        System.out.println(Arrays.toString(paises));
    }
    private static boolean bubble_sort(String[] paises){
        if(paises == null)return false;{

        }
        for(int i= 0;i < paises.length-1;i++){
            for(int j= 0; j < paises.length-1-i; j++){
                if(paises[j].compareToIgnoreCase(paises[j+1])>0){
                    String tmp = paises[j];
                    paises[j]= paises[j+1];
                    paises[j+1] = tmp;
                }
            }
        }
        return true;

    }
}
