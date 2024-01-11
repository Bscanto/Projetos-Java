package Secao_5_Estrutura_Condicional;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("inserir um número: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O Número é PAR");
        } else {
            System.out.println("O número é IMPAR");
        }

    }

}
