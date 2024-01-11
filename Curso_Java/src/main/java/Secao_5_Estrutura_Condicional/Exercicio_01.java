package Secao_5_Estrutura_Condicional;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("inserir um número: ");
        num = scanner.nextInt();

        if (num > 0) {
            System.out.println("NÂO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

    }

}
