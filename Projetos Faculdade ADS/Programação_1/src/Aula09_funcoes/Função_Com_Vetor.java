
package Aula09_funcoes;
import java.util.Arrays;
public class Função_Com_Vetor {
    static void incrementar(int a[ ]){
        for (int i=0; i<a.length; i++)
        a[i] = a[i] + 1;
}
    public static void main(String[ ] args) {
        
        int vetor[ ] = {1, 4, 5, 8};
        incrementar(vetor);
        System.out.println(Arrays.toString(vetor));
}
}
