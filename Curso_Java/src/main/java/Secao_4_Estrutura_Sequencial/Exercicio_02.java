package Secao_4_Estrutura_Sequencial;

import java.util.Scanner;

/*
 Faca um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R, A, pi = 3.14159;

        R = scanner.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        scanner.close();
    }
}
