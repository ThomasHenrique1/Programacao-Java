package ProjetoAula8;

public class exercicio1 {
      /*
    * 
Utilize (adapte) o método de ordenação Selection Sort para ordenar valores
inteiros, por exemplo, para ordenar de maior a menor um vetor com números
inteiros:
int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
    * */
    public static void main(String[] args) {

        int []numbers = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        sort(numbers);
        printArray(numbers);

    }

    public static int [] sort(int [] A){
        for( int i= 0; i < A.length; i++ ){
            int maxIndex= i;
            for(int j = i +1; j < A.length; j++){
                if(A[j] > A[maxIndex]){
                    maxIndex = j;
                }

            }
            int temp = A[maxIndex];
            A[maxIndex] = A[i];
            A[i] = temp;
        }
        return A;
    }
    public static void printArray(int[] A){
        for(int i =0; i < A.length;i++){
            System.out.println(A[i]);
        }
    }
}
