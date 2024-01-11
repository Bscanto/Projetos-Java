package Secao_4_Estrutura_Sequencial;

import java.util.Scanner;

/*
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        int dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

    }

}
