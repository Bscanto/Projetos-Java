package Secao_4_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Exercicio_05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = scanner.nextInt();
        qte1 = scanner.nextInt();
        preco1 = scanner.nextDouble();

        cod2 = scanner.nextInt();
        qte2 = scanner.nextInt();
        preco2 = scanner.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}
