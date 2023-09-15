package Aula09_funcoes;
import java.util.Arrays;

/**
 ▪ Criar uma função que recebe um vetor e inverte a ordem de seus elementos
 */
public class Atividade4_Inverter_Vetor {
    static void vetor (int v[ ]){
       for (int i =0; i<5; i++){
             
     System.out.println(Arrays.toString(v));
         for(i = 0; i<5; i++){
         int posicao = i;
         int temp = v[posicao];
         v[posicao] = v[v.length-1-posicao];
         v[v.length-1-posicao] = temp;
         }
       }
       
    }
      public static void main(String[] args) {
          System.out.println("Vetor Principal :");
        int a[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        vetor (a);
          System.out.println("Vetor Invertido (ao contrário):");
        System.out.println(Arrays.toString(a));
      }
}