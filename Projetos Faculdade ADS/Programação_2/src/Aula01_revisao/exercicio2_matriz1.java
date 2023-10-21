
package Aula01_revisao;
/**
 Faça um programa que gere as seguintes matrizes
 */
public class exercicio2_matriz1 {

   public static int[][] gerarMatriz(int linhas, int colunas) {
    int[][] matriz = new int[linhas][colunas];
    int contador = 0;

    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            matriz[i][j] = contador;
            contador++;
        }
    }

    return matriz;
}
 public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
       public static void main(String[] args) {
        int[][] matriz = gerarMatriz(3, 6);
        imprimirMatriz(matriz);
    }
}