
package Aula01_revisao;

/**
 Faça uma função que recebe um vetor e calcula
a média de seus valorese  o maior valor.
 */
public class Exercicios1 {
    public static void mediaEMaior(int[] vetor) {
    int soma = 0;
    int maior = vetor[0];

    for (int i = 0; i < vetor.length; i++) {
        soma += vetor[i];
        if (vetor[i] > maior) {
            maior = vetor[i];
        }
    }

    double media = (double) soma / vetor.length;
    System.out.println("A média é " + media);
    System.out.println("O maior valor é " + maior);
}
    
    public static void main(String[] args) {
        int[] vetor = {8, 7, 5, 9, 7};
mediaEMaior(vetor);
    }
}
