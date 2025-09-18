//Implementar o algoritmo de ordenação seleção.
public class LPEX1 {
    public static void main(String[] args) {
        int[] vet = {1,2,4,5,7,8,9,55,6,66,16,41,5,7,8,9,41,01,10,9};
        for (int i = 0; i < vet.length; i++){
            int posmin = i;

            for(int j = i+1;j<vet.length;j++){
                if(vet[j]<vet[posmin]){
                    posmin=j;
                }
            }
            int aux = vet[posmin];
            vet[posmin] = vet[i];
            vet[i] = aux;
        }
        for (int i = 0;i<vet.length;i++){
            System.out.print(" | " +vet[i]);
        }
    }
}
