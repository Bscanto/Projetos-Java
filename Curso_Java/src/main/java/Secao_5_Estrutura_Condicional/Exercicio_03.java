package Secao_5_Estrutura_Condicional;

import java.util.Scanner;

/*
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;

        System.out.println("inserir o valor para A: ");
        A = scanner.nextInt();

        System.out.println("inserir o valor para B: ");
        B = scanner.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }
    }

}
