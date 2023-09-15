package Aula09_funcoes;

import java.util.Arrays;

/**
 ▪ Criar uma função que recebe um vetor e modifica os valores para o dobro
 */
public class Atividade3_Função_Vetor_Dobro {
     static void incrementar(int a[ ]){
        for (int i=0; i<a.length; i++)
        a[i] = a[i] * 2;
}
    public static void main(String[ ] args) {
        
        int vetor[ ] = {2, 4, 6, 8};
        incrementar(vetor);
        
        System.out.println("O dobro do valor da matriz (2,4,6,8) é : ");
        System.out.println(Arrays.toString(vetor));
}
}